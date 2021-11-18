package pe.edu.upc.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upc.entidades.entidad_financiera;

@Service
public interface entidad_financieraService {
	public List<entidad_financiera> lista() throws Exception;
	public entidad_financiera registrar(@RequestBody entidad_financiera entidad_financiera) throws Exception;
	public entidad_financiera getentidad_financiera(Long identidad_financiera) throws Exception;
}
