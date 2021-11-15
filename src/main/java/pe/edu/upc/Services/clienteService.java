package pe.edu.upc.Services;

import java.util.List;

import pe.edu.upc.entidades.cliente;

public interface clienteService {
	public List<cliente> listclientes();
	public cliente register(cliente cli);
}
