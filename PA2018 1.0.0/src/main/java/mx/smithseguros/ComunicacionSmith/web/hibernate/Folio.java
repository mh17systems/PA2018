package mx.smithseguros.ComunicacionSmith.web.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import mx.smithseguros.ComunicacionSmith.web.action.BaseAction;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "folios", catalog = "smith")
public class Folio implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String idFolio;
	private String fecha;
	private String idEmisor;
	private String idReceptor;
	private String idRelacion;
	private String titulo;
	private String detalles;
	private String stat;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idFolio", unique = true, nullable = false, length=10)
	public String getIdFolio() {
		return idFolio;
	}
	public void setIdFolio(String idFolio) {
		this.idFolio = idFolio;
	}
	

	@Column(name = "fecha", nullable = false, length = 255, insertable = false)
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	@Column(name = "idReceptor", nullable = false, length = 255)
	public String getIdReceptor() {
		return idReceptor;
	}
	public void setIdReceptor(String idReceptor) {
		this.idReceptor = idReceptor;
	}
	
	
	@Column(name = "titulo", nullable = false, length = 255)
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	@Column(name = "detalles", nullable = false, length = 255)
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	
	@Column(name = "idEmisor", nullable = false, length = 255)
	public String getIdEmisor() {
		return idEmisor;
	}
	public void setIdEmisor(String idEmisor) {
		this.idEmisor = idEmisor;
	}
	
	
	@Column(name = "idRelacion", nullable = false, length = 255, insertable = false)
	public String getIdRelacion() {
		return idRelacion;
	}
	

	public void setIdRelacion(String idRelacion) {
		this.idRelacion = idRelacion;
	}
	
	@Column(name = "stat", nullable = false, length = 255, insertable = false)
	public String getStat() {
		return stat;
	}
	

	public void setStat(String stat) {
		this.stat = stat;
	}

	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Folio [idFolio=");
		stringBuilder.append(idFolio);
		stringBuilder.append(", fecha=");
		stringBuilder.append(fecha);
		stringBuilder.append(", idReceptor=");
		stringBuilder.append(idReceptor);
		stringBuilder.append(", idEmisor=");
		stringBuilder.append(idEmisor);
		stringBuilder.append(", titulo=");
		stringBuilder.append(titulo);
		stringBuilder.append(", detalles=");
		stringBuilder.append(detalles);
		stringBuilder.append(", idRelacion=");
		stringBuilder.append(idRelacion);
		stringBuilder.append(", stat=");
		stringBuilder.append(stat);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	
}
