package pe.edu.upc.Services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.letra;

public interface letraService {
	public List<letra> lista();
	public letra registrar(@RequestBody letra letra);
	public letra getletra(Long id) throws Exception;
	public List<letra> getletras(Long idCartera);
}
