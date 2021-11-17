package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entidades.cliente;

@Repository
public interface clienteRepositorio extends JpaRepository<cliente, Long>{

}
