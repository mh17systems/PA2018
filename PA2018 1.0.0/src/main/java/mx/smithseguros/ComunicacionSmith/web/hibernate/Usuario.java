package mx.smithseguros.ComunicacionSmith.web.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table( name = "users", catalog = "smith" )
public class Usuario implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String password;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String tipo;
	private String status;
	
	public Usuario() {}
	

	public Usuario(String usuario, String password, String nombre, String apPaterno) {
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
	}


	public Usuario(String usuario, String password, String nombre, String apPaterno, String apMaterno, String tipo,String status) {
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.tipo = tipo;
		this.status = status;
	}

	@Id
	@Column( name = "usuario", unique = true, nullable = false, length = 45 )
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Column ( name = "password", nullable = false, length = 45 )
	public String getPassword() {
		return password;
	}
	

	public void setPassword(String password) {
		this.password = password;
	}

	@Column ( name = "nombre", nullable = false, length = 45 )
	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column ( name = "apPaterno", nullable = false, length = 45 )
	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	

	@Column ( name = "apMaterno", length = 45 )
	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	@Column ( name = "tipo", length = 7)
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column ( name = "status", length = 7)
	public String getStatus() {
		return status;
	}
	

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Transient
	public String getNombreCompleto() {
		return new StringBuffer().append( nombre ).append(" ")
				.append( apPaterno ).append(
							( apMaterno != null ) ? " " + apMaterno : ""
						).toString();
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Usuario [mail=");
		stringBuilder.append(usuario);
		stringBuilder.append(", password=");
		stringBuilder.append(password);
		stringBuilder.append(", nombre=");
		stringBuilder.append(nombre);
		stringBuilder.append(", apPaterno=");
		stringBuilder.append(apPaterno);
		stringBuilder.append(", apMaterno=");
		stringBuilder.append(apMaterno);
		stringBuilder.append(", admin=");
		stringBuilder.append(tipo);
		stringBuilder.append(", status=");
		stringBuilder.append(status);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	
}
