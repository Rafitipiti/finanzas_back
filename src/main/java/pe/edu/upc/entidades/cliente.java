package pe.edu.upc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cliente {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombre;
    private String Domicilio;
    private String Localidad;
    private Long DNI;
    private Long Telefono;
    private double Dinero;
    
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }
	public Long getDNI() {
		return DNI;
	}
	public void setDNI(Long dNI) {
		DNI = dNI;
	}
	public Long getTelefono() {
		return Telefono;
	}
	public void setTelefono(Long telefono) {
		Telefono = telefono;
	}
	public double getDinero() {
		return Dinero;
	}
	public void setDinero(double dinero) {
		Dinero = dinero;
	}
    
}
