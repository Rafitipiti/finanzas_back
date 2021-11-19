package pe.edu.upc.rest;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@CrossOrigin
public class loginController {

	@GetMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model, Principal principal,
			RedirectAttributes flash) {
		
		if (principal != null) {
			flash.addFlashAttribute("info", "Ya ha inciado sesión anteriormente");
			return "redirect:/usuarios";
		}

		if (error != null) {
			model.addAttribute("error",
					"Usuario y/o contraseña incorrecta");
			return "login";
		}

		if (logout != null) {
			model.addAttribute("success", "Ha cerrado sesion con exito!");
			return "login";
		}
		
		return "login";

	}
	
}