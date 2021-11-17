package pe.edu.upc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.usuarioRepositorio;

@Service
public class usuarioServiceImpl implements usuarioService{
	
	@Autowired
	private usuarioRepositorio usuarioRepository;

	@Override
	public List<usuario> lista() {
		return (List<usuario>)usuarioRepository.findAll();
	}

	@Override
	public usuario registrar(usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@Override
	public usuario getusuario(Long id) {
		return usuarioRepository.findById(id).get();
	}
	
	@Override
	public void eliminarusuario(Long id) {
		usuarioRepository.deleteById(id);
	}
}
