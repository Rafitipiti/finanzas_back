package pe.edu.upc.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import pe.edu.upc.entidades.letra;

@Entity
public class costes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Description;
    private double MontoAsociado;
    private String Inicial_o_final;
    
    @ManyToOne
    @JoinColumn(name = "id_letra")
    private letra IdLetra;
    
    public costes(Long Id, String Description, double MontoAsociado, String Inicial_o_final) {
		super();
		this.Id = Id;
		this.Description = Description;
		this.MontoAsociado = MontoAsociado;
		this.Inicial_o_final = Inicial_o_final;
	}
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getMontoAsociado() {
        return MontoAsociado;
    }

    public void setMontoAsociado(double MontoAsociado) {
        this.MontoAsociado = MontoAsociado;
    }    
    public String getInicial_o_final() {
    	return Inicial_o_final;
    }
    
}
