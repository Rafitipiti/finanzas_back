package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.costes;
import pe.edu.upc.repositorios.costesRepositorio;


@Service
public class costesServiceImpl implements costesService{
	
	@Autowired
	private costesRepositorio costesRepository;

	@Override
	public List<costes> lista() {
		return (List<costes>)costesRepository.findAll();
	}

	@Override
	public costes registrar(costes costes) {
		return costesRepository.save(costes);
	}

	@Override
	public List<costes> obtenerListadoNombre(String description) {
		return costesRepository.findcostesDescription(description);
	}

	@Override
	public costes getcoste(Long id) {
		return costesRepository.findById(id).get();
	}	
	
}
