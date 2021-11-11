package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import pe.edu.upc.Services.usuarioService;
import pe.edu.upc.entidades.letra;
import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.letraRepositorio;

@Controller
@RequestMapping("/letra")
public class letraController {
	
	@Autowired
	private usuarioService service;
	
	@Autowired
	private letraRepositorio letrarepo;
	
	@RequestMapping("/bienvenido")
	public String Bienvenido() {
		return "bienvenido";		
	}
	
	@RequestMapping("/irRegistrar")
	public String irRegistrar(Model model) {
		model.addAttribute("letra", new letra());
		return "letra";
	}
	@GetMapping("/letra/{Id}")
	public String editUser(@PathVariable("Id") Long id, Model model) {
		usuario user = service.getusuario(id);
		model.addAttribute("user", user);
		return "user_form";
	}
	
	@GetMapping("/letras/{IdCartera}")
	public List<letra> getLetras(@PathVariable("IdCartera") Long IdCartera, Model model) {
		List<letra> lets = letrarepo.findletrasporcartera(IdCartera);
		return lets;
	}
}
