package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.edu.upc.entidades.cartera;

public interface carteraRepositorio extends JpaRepository<cartera, Long>{
	@Query("select c from cartera c where c.Id = ?1%")
	cartera findcartera(Long Id);
}
