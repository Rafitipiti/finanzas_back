package pe.edu.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entidades.entidad_financiera;

@Repository
public interface entidad_financieraRepositorio extends JpaRepository<entidad_financiera, Long>{

}
