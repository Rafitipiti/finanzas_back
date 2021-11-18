package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.Services.pago_de_letraService;
import pe.edu.upc.entidades.pago_de_letra;
import pe.edu.upc.repositorios.pago_de_letraRepositorio;

@RestController
@RequestMapping("/pago_de_letra")
public class pago_de_letraController {
	@Autowired
	private pago_de_letraRepositorio pago_de_letraRepository;
	
	@Autowired
	private pago_de_letraService pago_de_letraservice;
	
	@PostMapping("/register")
	public pago_de_letra register(@RequestBody pago_de_letra pago) throws Exception{
		return pago_de_letraRepository.save(pago);
	}
	
	@GetMapping("/{IdTasa}")
	public pago_de_letra gettasa(@PathVariable("Idpago_de_letra") Long Idpago_de_letra) throws Exception{
		return pago_de_letraservice.getpago_de_letra(Idpago_de_letra);
	}
}
