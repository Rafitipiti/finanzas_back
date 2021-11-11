package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.entidades.cliente;


public interface clienteRepositorio extends JpaRepository<cliente, Long>{

}
