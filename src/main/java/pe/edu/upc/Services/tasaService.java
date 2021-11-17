package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.tasa;

@Service
public interface tasaService {
	public List<tasa> lista();
	public tasa registrar(@RequestBody tasa tasa);
	public tasa gettasa(Long id);
}
