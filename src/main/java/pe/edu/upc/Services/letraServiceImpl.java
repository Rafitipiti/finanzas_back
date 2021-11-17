package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.costes;
import pe.edu.upc.entidades.letra;
import pe.edu.upc.entidades.pago_de_letra;
import pe.edu.upc.entidades.tasa;
import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.costesRepositorio;
import pe.edu.upc.repositorios.letraRepositorio;
import pe.edu.upc.repositorios.pago_de_letraRepositorio;
import pe.edu.upc.repositorios.tasaRepositorio;

@Service
public class letraServiceImpl implements letraService{

	@Autowired
	letraRepositorio letraRepository;
	
	@Autowired
	tasaRepositorio tasaRepository;
	
	@Autowired
	pago_de_letraRepositorio pago_de_letraRepository;
	
	@Autowired 
	costesRepositorio costesRepository;
	
	@Override
	public List<letra> lista() {
		return (List<letra>)letraRepository.findAll();
	}

	@Override
	public letra registrar(letra letra) {
		return letraRepository.save(letra);
	}

	@Override
	public letra getletra(Long id) throws Exception {
		return letraRepository.findById(id).get();
	}

	@Override
	public tasa gettasa(tasa id) throws Exception {
		return tasaRepository.findtasa(id.getId());
	}
	
	@Override
	public pago_de_letra getpago_de_letra(letra id) throws Exception{
		return pago_de_letraRepository.findpago(id.getId());
	}
	
	@Override
	public List<costes> getcostes(letra id) throws Exception {
		return costesRepository.findcostes(id.getId());
	}
	
	@Override
	public List<letra> getletras(usuario idUsuario) {
		List<letra> lista =  letraRepository.findletrasporusuario(idUsuario.getId());
		return lista;
	}	
	
	@Override
	public letra procesar_datos(Long id) throws Exception {
		letra let = getletra(id);
		tasa tas =  gettasa(let.getIdTasa());
		pago_de_letra p_letra = getpago_de_letra(let);
		List<costes> lcostes = getcostes(let);
		
		double plazo_dias = p_letra.getDias_transcurridos();
		double TEtd = get_TEtd(let,tas,plazo_dias);
		double dt = TEtd/(1+TEtd);
		double descuento = let.getValor_Nominal()*dt;
		double valor_neto = let.getValor_Nominal()-descuento;
		double sumacostosini = calc_sumacostosini(lcostes);
		double sumacostosfin = calc_sumacostosfin(lcostes);
		double valor_recibido = valor_neto-sumacostosini-let.getRetencion();
		double valor_entregado = let.getValor_Nominal()+sumacostosfin-let.getRetencion();
		double beneficioEF = valor_entregado-valor_recibido;
		double TCEP = Math.pow((valor_entregado/valor_recibido),(360/let.getTd()))-1;
		
		let.setDt(dt);
		let.setDescuento(descuento);
		let.setValor_Neto(valor_neto);
		let.setSumadeCostesIniciales(sumacostosini);
		let.setSumadeCostesFinales(sumacostosfin);
		let.setValor_Recibido(valor_recibido);
		let.setValor_Entregado(valor_entregado);
		let.setBeneficioEF(beneficioEF);
		let.setTCEP(TCEP);
		
		return letraRepository.save(let);
	}

	@Override
	public pago_de_letra procesar_datos2(Long id) throws Exception {
		letra let = getletra(id);
		tasa tas =  gettasa(let.getIdTasa());
		pago_de_letra p_letra = getpago_de_letra(let);
		if(p_letra.isMora()) {
			double ic = 1;
			double im = 1;
			int dias_de_mora = p_letra.getDias_transcurridos()-let.getTd();
			
			if(tas.getTipo_Tasa().equals("Nominal")) {
				ic = let.getValor_Nominal()*(Math.pow((1+tas.getValor_Tasa()/360), p_letra.getDias_transcurridos())-1);
				im = let.getValor_Nominal()*(Math.pow((1+calc_tasa_diaria_moratoria(dias_de_mora)/360),p_letra.getDias_transcurridos())-1);
			}
			if(tas.getTipo_Tasa().equals("Efectiva")) {
				ic = let.getValor_Nominal()*(Math.pow(1+tas.getValor_Tasa(),let.getTd()/p_letra.getDias_transcurridos())-1);
				im = let.getValor_Nominal()*(Math.pow(1+calc_tasa_diaria_moratoria(dias_de_mora),let.getTd()/p_letra.getDias_transcurridos())-1);
			}	
			double Valor_Entregado_Mora = let.getValor_Nominal()+let.getSumadeCostesFinales()-let.getRetencion()+im+ic;
			double TCEPm = Math.pow(let.getValor_Entregado()/let.getValor_Recibido(), 360/let.getTd()+dias_de_mora)-1;
			
			p_letra.setIc(ic);
			p_letra.setIm(im);
			p_letra.setValor_Entregado_Mora(Valor_Entregado_Mora);
			p_letra.setTCEPm(TCEPm);
			p_letra.setDias_de_mora(dias_de_mora);
		}		
		return pago_de_letraRepository.save(p_letra);
	}
	
	@Override
	public double calc_tasa_diaria_moratoria(int dias_atraso) {
		if(dias_atraso <= 8) {
			return Math.pow(1+1.0122, 1/360)-1;
		}
		if(dias_atraso <= 30 && dias_atraso >= 9) {
			return Math.pow(1+1.2522, 1/360)-1;
		}
		if(dias_atraso > 30) {
			return Math.pow(1+1.5182, 1/360)-1;
		}
		return 0;	
	}
	
	@Override
	public double get_TEtd(letra let, tasa tas, double plazo_dias) {
		double TEtd = 0;
		if(tas.getTipo_Tasa().equals("Nominal")) {
			TEtd = Math.pow(1+tas.getValor_Tasa()/360,plazo_dias)-1;
		}
		if(tas.getTipo_Tasa().equals("Efectiva")) {
			TEtd = Math.pow(1+tas.getValor_Tasa(),let.getTd()/plazo_dias)-1;
		}
		return TEtd;
	}
	
	@Override
	public double calc_sumacostosini(List<costes> lcostes) {
		double total = 0;
		for (int i = 0; i < lcostes.size(); i++){
		    if (lcostes.get(i).getInicial_o_final().equals("I")) {
		    	total += lcostes.get(i).getMontoAsociado();
		    }
		}
		return total;
	}

	@Override
	public double calc_sumacostosfin(List<costes> lcostes) {
		double total = 0;
		for (int i = 0; i < lcostes.size(); i++){
			if (lcostes.get(i).getInicial_o_final().equals("F")) {
				total += lcostes.get(i).getMontoAsociado();
		    }
		}
		return total;
	}

}
