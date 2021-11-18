package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="ef")
@Entity
public class entidad_financiera {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_ef")
	private Long Id;
	private String Nombre;
	public entidad_financiera(Long id, String nombre) {
		super();
		this.Id = id;
		this.Nombre = nombre;
	}
	public entidad_financiera() {
		super();
	}
	public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
    
}
