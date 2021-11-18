package pe.edu.upc.entidades;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="cliente")
@Entity
public class cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id_cliente")
    private Long Id;
    private String Nombre;
    private String Domicilio;
    private String Localidad;
    private int DNI;
    private int Telefono;
    private double Dinero;

    public cliente(Long id, String nombre, String domicilio, String localidad, int dni, int telefono, double dinero) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.Domicilio = domicilio;
		this.Localidad = localidad;
		this.DNI = dni;
		this.Telefono = telefono;
		this.Dinero = dinero;
	}

	public cliente() {
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

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public double getDinero() {
		return Dinero;
	}
	public void setDinero(double dinero) {
		Dinero = dinero;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
    
}
