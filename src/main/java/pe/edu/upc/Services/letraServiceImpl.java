package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.letra;
import pe.edu.upc.repositorios.letraRepositorio;

@Service
public class letraServiceImpl implements letraService{

	@Autowired
	letraRepositorio letraRepository;
	
	@Override
	public List<letra> lista() {
		return (List<letra>)letraRepository.findAll();
	}

	@Override
	public letra registrar(letra letra) {
		return letraRepository.save(letra);
	}

	@Override
	public letra getletra(Long id) throws Exception {
		return letraRepository.findletra(id);
	}

	@Override
	public List<letra> getletras(Long idCartera) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
