package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import pe.edu.upc.Services.letraService;
import pe.edu.upc.entidades.cliente;
import pe.edu.upc.entidades.letra;
import pe.edu.upc.entidades.pago_de_letra;
import pe.edu.upc.entidades.usuario;
import pe.edu.upc.repositorios.letraRepositorio;
import pe.edu.upc.repositorios.pago_de_letraRepositorio;

@RestController
@CrossOrigin
@RequestMapping("/letra")
public class letraController {
	
	@Autowired
	private letraRepositorio letrarepo;

	@Autowired
	private letraService letraservice;
	
	@Autowired
	private pago_de_letraRepositorio pago_de_letrarepo;
	
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
		pago_de_letra pletrita = letraservice.procesar_datos2(IdLetra);
		if(pletrita.isMora()) {
			letrita.setTCEP(pletrita.getTCEPm());
			letrita.setValor_Entregado(pletrita.getValor_Entregado_Mora());	
			letrita.setBeneficioEF(pletrita.getValor_Entregado_Mora()-letrita.getValor_Recibido());
		}
		return letrarepo.save(letrita);
	}
	
	@GetMapping("/execute2/{IdLetra}")
	public pago_de_letra ejecutar2(@PathVariable("IdLetra") letra IdLetra) throws Exception{
		pago_de_letra pletrita = letraservice.procesar_datos2(IdLetra);
		return pago_de_letrarepo.save(pletrita);
	}
	
	@GetMapping("/all")
	public List<letra> getallletras() throws Exception{
		return letrarepo.findAll();
	}
}




