package pe.edu.upc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.Services.clienteService;
import pe.edu.upc.entidades.cliente;
import pe.edu.upc.repositorios.clienteRepositorio;

@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class clienteController {
	@Autowired
	private clienteRepositorio clienteRepository;
	
	@Autowired
	private clienteService clienteservice;
	
	@PostMapping("/register")
	public cliente register(@RequestBody cliente cli) throws Exception{
		return clienteRepository.save(cli);
	}
	
	@GetMapping("/{Idcliente}")
	public cliente getcliente(@PathVariable("Idcliente") Long Idcliente) throws Exception{
		return clienteservice.getcliente(Idcliente);
	}
	
	@GetMapping("/all")
	public List<cliente> getallclientes() throws Exception{
		return clienteRepository.findAll();
	}
}
