package pe.edu.upc.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.edu.upc.entidades.letra;

public interface letraRepositorio extends JpaRepository<letra, Long>{
	@Query("select l from letra l where l.Id = ?1%")
	letra findletra(Long Id);
	
	@Query("select l from letra l where l.IdUsuario = ?1%")
	List<letra> findletrasporusuario(Long IdUsuario);
}
