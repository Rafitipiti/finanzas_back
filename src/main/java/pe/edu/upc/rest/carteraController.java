package pe.edu.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import pe.edu.upc.Services.letraService;
import pe.edu.upc.entidades.letra;

@Controller
@RequestMapping("/cartera")
public class carteraController {
	@Autowired
	private letraService letraservice;
	
	@GetMapping("/letra/{Id}")
	public letra getLetra(@PathVariable("Id") Long id, Model model) throws Exception {
		letra let = letraservice.getletra(id);
		return let;
	}
	
	@GetMapping("/letras")
	public List<letra> getLetras(@PathVariable("IdCartera") Long IdCartera, Model model) throws Exception {
		List<letra> let= letraservice.getletras(IdCartera);
		return let;
	}
}
