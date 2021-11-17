package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.cliente;

@Service
public interface clienteService {
	public List<cliente> listclientes();
	public cliente register(cliente cli);
	public cliente getcliente(Long id);
}
