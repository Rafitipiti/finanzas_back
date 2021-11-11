package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.tasa;
import pe.edu.upc.repositorios.tasaRepositorio;

@Service
public class tasaServiceImpl implements tasaService{

	@Autowired
	private tasaRepositorio tasaRepository;
	
	@Override
	public List<tasa> lista() {
		return (List<tasa>)tasaRepository.findAll();
	}

	@Override
	public tasa registrar(tasa tasa) {
		return tasaRepository.save(tasa);
	}

}
