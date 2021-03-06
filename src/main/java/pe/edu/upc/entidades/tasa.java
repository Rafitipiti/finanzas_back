package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="tasa")
@Entity
public class tasa {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tasa")
	private Long Id;
	private double Valor_Tasa;
	private String Tipo_Tasa;
	private String capitalizacion;
	private String Plazo_Tasa;
	
	public tasa(Long id, double valor_Tasa, String tipo_Tasa, String Capitalizacion, String plazo_Tasa) {
			super();
			this.Id = id;
			this.Valor_Tasa = valor_Tasa;
			this.Tipo_Tasa = tipo_Tasa;
			this.capitalizacion = Capitalizacion;
			this.Plazo_Tasa = plazo_Tasa;
	}
	public tasa() {
		super();
	}
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
