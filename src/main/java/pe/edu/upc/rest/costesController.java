package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.entidades.costes;
import pe.edu.upc.repositorios.costesRepositorio;

@Controller
@RequestMapping("/costes")
public class costesController {
	@Autowired
	private costesRepositorio costesRepository;
	
	@PostMapping("/register")
	public costes register(@RequestBody costes cos) {
		return costesRepository.save(cos);
	}
	
	@GetMapping("/{IdCoste}")
	public costes getcoste(@PathVariable("IdCoste") Long IdCoste) {
		return costesRepository.getById(IdCoste);
	}
}
