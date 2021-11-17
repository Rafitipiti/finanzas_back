package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entidades.tasa;

@Repository
public interface tasaRepositorio extends JpaRepository<tasa, Long> {
	@Query("select t from tasa t where t.Id = ?1")
	tasa findtasa(Long Id);
}
