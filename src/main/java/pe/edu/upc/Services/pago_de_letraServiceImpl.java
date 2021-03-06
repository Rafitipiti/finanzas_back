package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.pago_de_letra;
import pe.edu.upc.repositorios.pago_de_letraRepositorio;

@Service
public class pago_de_letraServiceImpl implements pago_de_letraService{
	
	@Autowired
	private pago_de_letraRepositorio pago_de_letraRepository;
	
	@Override
	public List<pago_de_letra> lista() throws Exception{
		return (List<pago_de_letra>)pago_de_letraRepository.findAll();
	}

	@Override
	public pago_de_letra registrar(pago_de_letra pago) throws Exception{
		return pago_de_letraRepository.save(pago);
	}
	
	@Override
	public pago_de_letra getpago_de_letra(Long id) throws Exception{
		return pago_de_letraRepository.findById(id).orElseThrow(() -> new Exception("No existe pago_de_letra con el ID: "+ id));
	}
	
	@Override
	public pago_de_letra getpago_de_letraporletra(Long idletra) throws Exception{
		return pago_de_letraRepository.findpago(idletra);
	}

}
