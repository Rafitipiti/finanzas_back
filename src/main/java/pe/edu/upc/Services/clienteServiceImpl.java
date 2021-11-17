package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.cliente;
import pe.edu.upc.repositorios.clienteRepositorio;

@Service
public class clienteServiceImpl implements clienteService{
	@Autowired
	clienteRepositorio clienteRepository;
	
	@Override
	public List<cliente> listclientes() {
		return (List<cliente>)clienteRepository.findAll();
	}
	
	@Override
	public cliente register(cliente cli) {
		return clienteRepository.save(cli);
	}

	@Override
	public cliente getcliente(Long id) {
		return clienteRepository.findById(id).get();
	}
}
