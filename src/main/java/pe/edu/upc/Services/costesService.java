package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.costes;

@Service
public interface costesService {
	public List<costes> lista() throws Exception;
	public costes registrar(@RequestBody costes costes) throws Exception;
	public List<costes> obtenerListadoNombre(String description) throws Exception;
	public costes getcoste(Long id) throws Exception;
	public List<costes> getcostes(Long idletra) throws Exception;
}
