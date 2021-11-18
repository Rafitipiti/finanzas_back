package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.entidad_financiera;
import pe.edu.upc.repositorios.entidad_financieraRepositorio;

@Service
public class entidad_financieraServiceImpl implements entidad_financieraService{
	@Autowired
	private entidad_financieraRepositorio entidad_financieraRepository;

	@Override
	public List<entidad_financiera> lista() throws Exception{
		return (List<entidad_financiera>)entidad_financieraRepository.findAll();
	}

	@Override
	public entidad_financiera registrar(entidad_financiera entidad_financiera) throws Exception{
		return entidad_financieraRepository.save(entidad_financiera);
	}

	@Override
	public entidad_financiera getentidad_financiera(Long id) throws Exception{
		return entidad_financieraRepository.findById(id).orElseThrow(() -> new Exception("No existe entidad_financiera con el ID: "+ id));
	}
	
}
