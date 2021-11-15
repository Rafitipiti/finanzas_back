package pe.edu.upc.Services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.entidad_financiera;

public interface entidad_financieraService {
	public List<entidad_financiera> lista();
	public entidad_financiera registrar(@RequestBody entidad_financiera entidad_financiera);
}
