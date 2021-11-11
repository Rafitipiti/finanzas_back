package pe.edu.upc.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class cartera {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Long Cantidad_letras;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private usuario IdUsuario;
	
	public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
	public Long getCantidad_letras() {
		return Cantidad_letras;
	}
	public void setCantidad_letras(Long cantidad_letras) {
		Cantidad_letras = cantidad_letras;
	}	
}
