package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.costes;

@Service
public interface costesService {
	public List<costes> lista();
	public costes registrar(@RequestBody costes costes);
	public List<costes> obtenerListadoNombre(String description);
	public costes getcoste(Long id);
}
