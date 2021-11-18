package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.cliente;
import pe.edu.upc.repositorios.clienteRepositorio;

@Service
public class clienteServiceImpl implements clienteService{
	@Autowired
	private clienteRepositorio clienteRepository;
	
	@Override
	public List<cliente> listclientes() throws Exception{
		return (List<cliente>)clienteRepository.findAll();
	}
	
	@Override
	public cliente register(cliente cli) throws Exception{
		return clienteRepository.save(cli);
	}

	@Override
	public cliente getcliente(Long id) throws Exception{
		return clienteRepository.findById(id).orElseThrow(() -> new Exception("No existe cliente con el ID: "+ id));
	}
}
