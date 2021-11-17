package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entidades.usuario;

@Repository
public interface usuarioRepositorio extends JpaRepository<usuario, Long>{
	@Query("SELECT u FROM usuario u WHERE u.Correo = ?1")
	public usuario get(String Correo);
}
