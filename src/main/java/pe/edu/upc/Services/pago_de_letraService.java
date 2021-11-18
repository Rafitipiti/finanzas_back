package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.pago_de_letra;

@Service
public interface pago_de_letraService {
	public List<pago_de_letra> lista() throws Exception;
	public pago_de_letra registrar(@RequestBody pago_de_letra pago) throws Exception;
	public pago_de_letra getpago_de_letra(Long id) throws Exception;
	public pago_de_letra getpago_de_letraporletra(Long idletra) throws Exception;
}
