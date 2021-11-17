package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.entidad_financiera;
import pe.edu.upc.entidades.tasa;
import pe.edu.upc.repositorios.entidad_financieraRepositorio;

@Service
public class entidad_financieraServiceImpl implements entidad_financieraService{
	@Autowired
	entidad_financieraRepositorio entidad_financieraRepository;

	@Override
	public List<entidad_financiera> lista() {
		return (List<entidad_financiera>)entidad_financieraRepository.findAll();
	}

	@Override
	public entidad_financiera registrar(entidad_financiera entidad_financiera) {
		return entidad_financieraRepository.save(entidad_financiera);
	}

	@Override
	public entidad_financiera getentidad_financiera(Long id) {
		return entidad_financieraRepository.findById(id).get();
	}
	
}
