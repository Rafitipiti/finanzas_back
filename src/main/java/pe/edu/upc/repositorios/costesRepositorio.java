package pe.edu.upc.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.edu.upc.entidades.costes;

public interface costesRepositorio extends JpaRepository<costes, Long>{
	@Query("select c from costes c  where c.Description like ?1%")
	List<costes> findcostesDescription(String description);
	
	@Query("select c from costes c where c.IdLetra = ?1%")
	List<costes> findcostes(Long Id);
}
