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
	public List<letra> lista() throws Exception;
	public letra registrar(@RequestBody letra letra) throws Exception;
	public letra getletra(Long id) throws Exception;
	public List<letra> getletras(usuario idUsuario) throws Exception;
	public letra procesar_datos(letra let) throws Exception;
	public double get_TEtd(letra let, tasa tas, double plazo_dias) throws Exception;
	public double calc_sumacostosini(List<costes> lcostes) throws Exception;
	public double calc_sumacostosfin(List<costes> lcostes) throws Exception;
	public pago_de_letra procesar_datos2(letra let) throws Exception;
	public double calc_tasa_diaria_moratoria(int dias_atraso) throws Exception; 
}
