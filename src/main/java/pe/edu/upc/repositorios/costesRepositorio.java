package pe.edu.upc.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entidades.costes;
import pe.edu.upc.entidades.letra;

@Repository
public interface costesRepositorio extends JpaRepository<costes, Long>{
	@Query("select c from costes c  where c.Description like ?1%")
	List<costes> findcostesDescription(String description);
	
	@Query("select c from costes c where c.IdLetra.Id = ?1")
	List<costes> findcostes(Long Id);
}
