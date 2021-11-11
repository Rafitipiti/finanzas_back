package pe.edu.upc.Services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.pago_de_letra;

public interface pago_de_letraService {
	public List<pago_de_letra> lista();
	public pago_de_letra registrar(@RequestBody pago_de_letra pago);
}
