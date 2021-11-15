package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upc.entidades.tasa;
import pe.edu.upc.repositorios.tasaRepositorio;

@Controller
@RequestMapping("/tasa")
public class tasaController {
	@Autowired
	private tasaRepositorio tasaRepository;
	
	@PostMapping("/register")
	public tasa register(@RequestBody tasa tas) {
		return tasaRepository.save(tas);
	}
	
	@GetMapping("/{IdTasa}")
	public tasa gettasa(@PathVariable("IdTasa") Long IdTasa) {
		return tasaRepository.getById(IdTasa);
	}
}
