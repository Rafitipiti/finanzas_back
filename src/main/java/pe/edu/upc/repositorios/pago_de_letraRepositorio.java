package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entidades.letra;
import pe.edu.upc.entidades.pago_de_letra;

@Repository
public interface pago_de_letraRepositorio extends JpaRepository<pago_de_letra, Long> {
	@Query("select l from pago_de_letra l where l.IdLetra.Id = ?1")
	pago_de_letra findpago(Long Id);
}
