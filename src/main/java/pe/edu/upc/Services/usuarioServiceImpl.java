package pe.edu.upc.Services;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.usuarioRepositorio;

@Service
public class usuarioServiceImpl implements usuarioService{
	
	@Autowired
	private usuarioRepositorio usuarioRepository;

	@Override
	public List<usuario> lista() throws Exception{
		return (List<usuario>)usuarioRepository.findAll();
	}

	@Override
	public usuario registrar(usuario usuario) throws Exception{
		return usuarioRepository.save(usuario);
	}
	
	@Override
	public usuario getusuario(Long id) throws Exception{
		return usuarioRepository.findById(id).orElseThrow(() -> new Exception("No existe usuario con el ID: "+ id));
	}
	
	@Override
	public void eliminarusuario(Long id) throws Exception{
		usuarioRepository.deleteById(id);
	}
}
