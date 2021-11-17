package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.costes;
import pe.edu.upc.entidades.letra;
import pe.edu.upc.entidades.pago_de_letra;
import pe.edu.upc.entidades.tasa;
import pe.edu.upc.entidades.usuario;

@Service
public interface letraService {
	public List<letra> lista();
	public letra registrar(@RequestBody letra letra);
	public letra getletra(Long id) throws Exception;
	public tasa gettasa(tasa id) throws Exception;
	public List<letra> getletras(usuario idUsuario);
	public pago_de_letra getpago_de_letra(letra id) throws Exception;
	public List<costes> getcostes(letra id) throws Exception;
	public letra procesar_datos(Long id) throws Exception;
	public double get_TEtd(letra let, tasa tas, double plazo_dias);
	public double calc_sumacostosini(List<costes> lcostes);
	public double calc_sumacostosfin(List<costes> lcostes);
	public pago_de_letra procesar_datos2(Long id) throws Exception;
	double calc_tasa_diaria_moratoria(int dias_atraso); 
}
