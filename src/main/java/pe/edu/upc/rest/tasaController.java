package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.Services.tasaService;
import pe.edu.upc.entidades.tasa;
import pe.edu.upc.repositorios.tasaRepositorio;

@RestController
@RequestMapping("/tasa")
public class tasaController {
	@Autowired
	private tasaRepositorio tasaRepository;
	
	@Autowired
	private tasaService tasaservice;
	
	@PostMapping("/register")
	public tasa register(@RequestBody tasa tas) throws Exception{
		return tasaRepository.save(tas);
	}
	
	@GetMapping("/{IdTasa}")
	public tasa gettasa(@PathVariable("IdTasa") Long IdTasa) throws Exception {
		return tasaservice.gettasa(IdTasa);
	}
}
