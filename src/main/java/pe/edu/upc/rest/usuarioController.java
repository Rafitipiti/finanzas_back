package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.Services.usuarioService;
import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.usuarioRepositorio;

@RestController
@RequestMapping("/usuario")
public class usuarioController {
	
	@Autowired
	private usuarioRepositorio usuarioRepository;
	
	@Autowired
	private usuarioService usuarioservice;
	
	@PostMapping("/register")
	public usuario register(@RequestBody usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@GetMapping("/{IdUsuario}")
	public usuario getusuario(@PathVariable("IdUsuario") Long IdUsuario) {
		return usuarioservice.getusuario(IdUsuario);
	}
}
