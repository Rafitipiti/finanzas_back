package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.usuario;

@Service
public interface usuarioService {
	public List<usuario> lista();
	public usuario registrar(@RequestBody usuario usuario);
	public usuario getusuario(Long id);
	public void eliminarusuario(Long id);
}
