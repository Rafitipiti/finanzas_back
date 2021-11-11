package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.cartera;
import pe.edu.upc.repositorios.carteraRepositorio;

@Service
public class carteraServiceImpl implements carteraService{
	
	@Autowired
	private carteraRepositorio carteraRepository;
	
	@Override
	public List<cartera> lista() {
		return (List<cartera>)carteraRepository.findAll();
	}

	@Override
	public cartera registrar(cartera car) {
		return carteraRepository.save(car);
	}

	@Override
	public cartera getCartera(Long id) throws Exception {
		return carteraRepository.findcartera(id);
	}
}
