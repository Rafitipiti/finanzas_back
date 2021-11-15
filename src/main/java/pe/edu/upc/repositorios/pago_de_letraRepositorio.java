package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.edu.upc.entidades.pago_de_letra;

public interface pago_de_letraRepositorio extends JpaRepository<pago_de_letra, Long> {
	@Query("select l from pago_de_letra l where l.IdLetra = ?1%")
	pago_de_letra findpago(Long Id);
}
