package pe.edu.upc.entidades;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Table(name ="letra")
@Entity
public class letra {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_letra")
	private Long Id;
	
	@ManyToOne
    @JoinColumn(name = "id_Acreedor",insertable=true,updatable=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private cliente IdAcreedor;
	
	@ManyToOne
    @JoinColumn(name = "id_Deudor",insertable=true,updatable=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private cliente IdDeudor;
	
	@ManyToOne
    @JoinColumn(name = "id_tasa",insertable=true,updatable=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private tasa IdTasa;
	
	@ManyToOne
    @JoinColumn(name = "id_ef",insertable=true,updatable=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private entidad_financiera IdEf;
	
	@ManyToOne
    @JoinColumn(name = "id_usuario",insertable=true,updatable=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private usuario IdUsuario;
	
	private double Valor_Nominal;
	private int Td;
	private double Retencion;
	private double Descuento;
	private double Dt;
	private double SumadeCostesIniciales;
	private double SumadeCostesFinales;
	private double Valor_Neto;
	private double Valor_Recibido;
	private double Valor_Entregado;
	private double TCEP;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date Fecha_Inicio;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date Fecha_Fin;
	
	private String Lugar_Giro;
	private String Pago_textual;
	private double BeneficioEF;
	
	public letra(Long id, cliente idAcreedor, cliente idDeudor, tasa idTasa, entidad_financiera idEf, usuario idUsuario, double valor_Nominal, int td,
			 double retencion, double descuento, double dt, double sumacostesini, double sumacostesfin, double valor_neto, double valor_recibido,
			 double valor_entregado, double tCEP, Date fecha_ini, Date fecha_fin, String lugar_giro, String pago_tex, double beneficioef) {
		super();
		this.Id = id;
		this.IdAcreedor = idAcreedor;
		this.IdDeudor = idDeudor;
		this.IdTasa = idTasa;
		this.IdEf = idEf;
		this.IdUsuario = idUsuario;
		this.Valor_Nominal = valor_Nominal;
		this.Td = td;
		this.Retencion = retencion;
		this.Descuento = descuento;
		this.Dt = dt;
		this.SumadeCostesIniciales = sumacostesini;
		this.SumadeCostesFinales = sumacostesfin;
		this.Valor_Neto = valor_neto;
		this.Valor_Recibido = valor_recibido;
		this.Valor_Entregado = valor_entregado;
		this.TCEP = tCEP;
		this.Fecha_Inicio = fecha_ini;
		this.Fecha_Fin = fecha_fin;
		this.Lugar_Giro = lugar_giro;
		this.Pago_textual = pago_tex;
		this.BeneficioEF = beneficioef;
	} 
	public letra() {
		super();
	}
	public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
	public tasa getIdTasa() {
        return IdTasa;
    }
    public void setIdTasa(tasa IdTasa) {
        this.IdTasa = IdTasa;
    }
    public entidad_financiera getIdEf() {
        return IdEf;
    }
    public void setIdEf(entidad_financiera IdEf) {
        this.IdEf = IdEf;
    }
	public usuario getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(usuario idUsuario) {
		IdUsuario = idUsuario;
	}
	public double getValor_Nominal() {
		return Valor_Nominal;
	}
	public void setValor_Nominal(double valor_Nominal) {
		Valor_Nominal = valor_Nominal;
	}
	public double getRetencion() {
		return Retencion;
	}
	public void setRetencion(double retencion) {
		Retencion = retencion;
	}
	public int getTd() {
		return Td;
	}
	public void setTd(int td) {
		Td = td;
	}
	public double getDescuento() {
		return Descuento;
	}
	public void setDescuento(double descuento) {
		Descuento = descuento;
	}
	public double getDt() {
		return Dt;
	}
	public void setDt(double dt) {
		Dt = dt;
	}
	public double getSumadeCostesIniciales() {
		return SumadeCostesIniciales;
	}
	public void setSumadeCostesIniciales(double sumadeCostesIniciales) {
		SumadeCostesIniciales = sumadeCostesIniciales;
	}
	public double getSumadeCostesFinales() {
		return SumadeCostesFinales;
	}
	public void setSumadeCostesFinales(double sumadeCostesFinales) {
		SumadeCostesFinales = sumadeCostesFinales;
	}
	public double getValor_Neto() {
		return Valor_Neto;
	}
	public void setValor_Neto(double valor_Neto) {
		Valor_Neto = valor_Neto;
	}
	public double getValor_Recibido() {
		return Valor_Recibido;
	}
	public void setValor_Recibido(double valor_Recibido) {
		Valor_Recibido = valor_Recibido;
	}
	public double getValor_Entregado() {
		return Valor_Entregado;
	}
	public void setValor_Entregado(double valor_Entregado) {
		Valor_Entregado = valor_Entregado;
	}
	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}
	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}
	public Date getFecha_Fin() {
		return Fecha_Fin;
	}
	public void setFecha_Fin(Date fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}
	public String getLugar_Giro() {
		return Lugar_Giro;
	}
	public void setLugar_Giro(String lugar_Giro) {
		Lugar_Giro = lugar_Giro;
	}
	public String getPago_textual() {
		return Pago_textual;
	}
	public void setPago_textual(String pago_textual) {
		Pago_textual = pago_textual;
	}
	public double getBeneficioEF() {
		return BeneficioEF;
	}
	public void setBeneficioEF(double beneficioEF) {
		BeneficioEF = beneficioEF;
	}
	public double getTCEP() {
		return TCEP;
	}
	public void setTCEP(double tCEP) {
		TCEP = tCEP;
	}
	public cliente getIdAcreedor() {
		return IdAcreedor;
	}
	public void setIdAcreedor(cliente idAcreedor) {
		IdAcreedor = idAcreedor;
	}
	public cliente getIdDeudor() {
		return IdDeudor;
	}
	public void setIdDeudor(cliente idDeudor) {
		IdDeudor = idDeudor;
	}
}
