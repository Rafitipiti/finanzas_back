package pe.edu.upc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tasa {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private double Valor_Tasa;
	private String Tipo_Tasa;
	private String capitalizacion;
	private String Plazo_Tasa;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public double getValor_Tasa() {
		return Valor_Tasa;
	}
	public void setValor_Tasa(double valor_Tasa) {
		Valor_Tasa = valor_Tasa;
	}
	public String getTipo_Tasa() {
		return Tipo_Tasa;
	}
	public void setTipo_Tasa(String tipo_Tasa) {
		Tipo_Tasa = tipo_Tasa;
	}
	public String getCapitalizacion() {
		return capitalizacion;
	}
	public void setCapitalizacion(String capitalizacion) {
		this.capitalizacion = capitalizacion;
	}
	public String getPlazo_Tasa() {
		return Plazo_Tasa;
	}
	public void setPlazo_Tasa(String plazo_Tasa) {
		Plazo_Tasa = plazo_Tasa;
	}
	
	
}
