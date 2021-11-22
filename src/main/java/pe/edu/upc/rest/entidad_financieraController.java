package pe.edu.upc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.Services.entidad_financieraService;
import pe.edu.upc.entidades.entidad_financiera;
import pe.edu.upc.repositorios.entidad_financieraRepositorio;

@RestController
@CrossOrigin
@RequestMapping("/entidad_financiera")
public class entidad_financieraController {
	@Autowired
	private entidad_financieraRepositorio entidad_financieraRepository;
	
	@Autowired
	private entidad_financieraService entidad_financieraservice;
	
	@PostMapping("/register")
	public entidad_financiera register(@RequestBody entidad_financiera tas) throws Exception{
		return entidad_financieraRepository.save(tas);
	}
	
	@GetMapping("/{Identidad_financiera}")
	public entidad_financiera getentidad_financiera(@PathVariable("Identidad_financiera") Long Identidad_financiera) throws Exception{
		return entidad_financieraservice.getentidad_financiera(Identidad_financiera);
	}
	@GetMapping("/entidades")
	public List<entidad_financiera> getall(){
		return entidad_financieraRepository.findAll();
	}
}
