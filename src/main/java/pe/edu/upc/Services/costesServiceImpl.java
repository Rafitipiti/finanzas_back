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
	public List<costes> lista() throws Exception{
		return (List<costes>)costesRepository.findAll();
	}

	@Override
	public costes registrar(costes costes) throws Exception{
		return costesRepository.save(costes);
	}

	@Override
	public List<costes> obtenerListadoNombre(String description) throws Exception{
		return costesRepository.findcostesDescription(description);
	}

	@Override
	public costes getcoste(Long id) throws Exception{
		return costesRepository.findById(id).orElseThrow(() -> new Exception("No existe coste con el ID: "+ id));
	}

	@Override
	public List<costes> getcostes(Long idletra) throws Exception {
		return costesRepository.findcostes(idletra);
	}
}
