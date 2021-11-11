package pe.edu.upc.Services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.tasa;


public interface tasaService {
	public List<tasa> lista();
	public tasa registrar(@RequestBody tasa tasa);
}
