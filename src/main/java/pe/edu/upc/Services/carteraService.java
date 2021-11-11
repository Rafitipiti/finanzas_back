package pe.edu.upc.Services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.cartera;

public interface carteraService {
	public List<cartera> lista();
	public cartera registrar(@RequestBody cartera cart);
	public cartera getCartera(Long id) throws Exception;
}
