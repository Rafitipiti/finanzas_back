package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.cliente;

@Service
public interface clienteService {
	public List<cliente> listclientes() throws Exception;
	public cliente register(cliente cli) throws Exception;
	public cliente getcliente(Long id) throws Exception;
}
