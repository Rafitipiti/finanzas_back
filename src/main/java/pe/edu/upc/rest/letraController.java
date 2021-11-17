package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import pe.edu.upc.entidades.letra;
import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.letraRepositorio;

@Controller
@RequestMapping("/letra")
public class letraController {
	
	@Autowired
	private letraRepositorio letrarepo;

	@GetMapping("/{Id}")
	public letra getletra(@PathVariable("Id") Long Id) {
		return letrarepo.getById(Id);
	}
	
	@GetMapping("/{IdUsuario}")
	public List<letra> getLetras(@PathVariable("IdUsuario") usuario IdUsuario) {
		List<letra> lets = letrarepo.findletrasporusuario(IdUsuario.getId());
		return lets;
	}
	
	@PostMapping("/register/{IdUsuario}")
	public letra register(@RequestBody letra let) {
		return letrarepo.save(let);
	}
}
