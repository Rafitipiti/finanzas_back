package pe.edu.upc.entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class letra {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
    @JoinColumn(name = "id_acreedor")
    private Long IdAcreedor;
	
	@ManyToOne
    @JoinColumn(name = "id_deudor")
    private Long IdDeudor;
	
	@ManyToOne
    @JoinColumn(name = "id_tasa")
    private Long IdTasa;
	
	@ManyToOne
    @JoinColumn(name = "id_ef")
    private Long IdEf;
	
	@ManyToOne
    @JoinColumn(name = "id_usuario")
    private Long IdUsuario;
	
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
	
	public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
    public Long getIdAcreedor() {
        return IdAcreedor;
    }
    public void setIdAcreedor(Long IdAcreedor) {
        this.IdAcreedor = IdAcreedor;
    }
    public Long getIdDeudor() {
        return IdDeudor;
    }
    public void setIdDeudor(Long IdDeudor) {
        this.IdDeudor = IdDeudor;
    }
    public Long getIdTasa() {
        return IdTasa;
    }
    public void setIdTasa(Long IdTasa) {
        this.IdTasa = IdTasa;
    }
    public Long getIdEf() {
        return IdEf;
    }
    public void setIdEf(Long IdEf) {
        this.IdEf = IdEf;
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
}
