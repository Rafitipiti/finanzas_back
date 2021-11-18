package pe.edu.upc.Services;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.usuario;

@Service
public interface usuarioService {
	public List<usuario> lista() throws Exception;
	public usuario registrar(@RequestBody usuario usuario) throws Exception;
	public usuario getusuario(Long id) throws Exception;
	public void eliminarusuario(Long id) throws Exception;
}
