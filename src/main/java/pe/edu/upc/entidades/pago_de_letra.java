package pe.edu.upc.entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class pago_de_letra {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_letra")
    private letra IdLetra;
	
	@ManyToOne
    @JoinColumn(name = "id_ef")
    private entidad_financiera IdEf;
	
	private double Monto_Pago;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date Fecha_Pago;
	
	private boolean Mora;
	private double Ic;
	private double Im;
	private double Valor_Entregado_Mora;
	private double TCEPm;
	private int dias_transcurridos;
	private int dias_de_mora;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public letra getIdLetra() {
		return IdLetra;
	}
	public void setIdLetra(letra idLetra) {
		IdLetra = idLetra;
	}
	public entidad_financiera getIdEf() {
		return IdEf;
	}
	public void setIdEf(entidad_financiera idEf) {
		IdEf = idEf;
	}
	public double getMonto_Pago() {
		return Monto_Pago;
	}
	public void setMonto_Pago(double monto_Pago) {
		Monto_Pago = monto_Pago;
	}
	public Date getFecha_Pago() {
		return Fecha_Pago;
	}
	public void setFecha_Pago(Date fecha_Pago) {
		Fecha_Pago = fecha_Pago;
	}
	public boolean isMora() {
		return Mora;
	}
	public void setMora(boolean mora) {
		Mora = mora;
	}
	public double getIc() {
		return Ic;
	}
	public void setIc(double ic) {
		Ic = ic;
	}
	public double getIm() {
		return Im;
	}
	public void setIm(double im) {
		Im = im;
	}
	public double getValor_Entregado_Mora() {
		return Valor_Entregado_Mora;
	}
	public void setValor_Entregado_Mora(double valor_Entregado_Mora) {
		Valor_Entregado_Mora = valor_Entregado_Mora;
	}
	public double getTCEPm() {
		return TCEPm;
	}
	public void setTCEPm(double tCEPm) {
		TCEPm = tCEPm;
	}
	public int getDias_transcurridos() {
		return dias_transcurridos;
	}
	public void setDias_transcurridos(int dias_transcurridos) {
		this.dias_transcurridos = dias_transcurridos;
	}
	public int getDias_de_mora() {
		return dias_de_mora;
	}
	public void setDias_de_mora(int dias_de_mora) {
		this.dias_de_mora = dias_de_mora;
	}
}
