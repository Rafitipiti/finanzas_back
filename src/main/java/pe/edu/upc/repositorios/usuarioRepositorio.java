package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.edu.upc.entidades.usuario;

public interface usuarioRepositorio extends JpaRepository<usuario, Long>{
	@Query("SELECT u FROM usuario u WHERE u.Correo = ?1")
	public usuario findByEmail(String Correo);
}
