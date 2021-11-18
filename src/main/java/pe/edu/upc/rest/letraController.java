package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import pe.edu.upc.Services.letraService;
import pe.edu.upc.entidades.letra;
import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.letraRepositorio;

@RestController
@RequestMapping("/letra")
public class letraController {
	
	@Autowired
	private letraRepositorio letrarepo;

	@Autowired
	private letraService letraservice;
	
	@GetMapping("/{Id}")
	public letra getletra(@PathVariable("Id") Long Id) throws Exception {
		return letraservice.getletra(Id);
	}
	
	@GetMapping("/letras/{IdUsuario}")
	public List<letra> getLetras(@PathVariable("IdUsuario") usuario IdUsuario) {
		List<letra> lets = letrarepo.findletrasporusuario(IdUsuario.getId());
		return lets;
	}
	
	@PostMapping("/register")
	public letra register(@RequestBody letra let) throws Exception{
		return letrarepo.save(let);
	}
	
	@GetMapping("/execute/{IdLetra}")
	public letra ejecutar(@PathVariable("IdLetra") letra IdLetra) throws Exception{
		letra letrita = letraservice.procesar_datos(IdLetra);
		return letrarepo.save(letrita);
	}
}
