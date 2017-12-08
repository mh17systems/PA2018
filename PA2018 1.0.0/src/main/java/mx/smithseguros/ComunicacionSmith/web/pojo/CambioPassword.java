package mx.smithseguros.ComunicacionSmith.web.pojo;


public class CambioPassword {
	private String passwdAnterior;
	private String passwdNuevo;
	private String passwdConfirmacion;
	

	public String getPasswdAnterior() {
		return passwdAnterior;
	}

	public void setPasswdAnterior(String passwdAnterior) {
		this.passwdAnterior = passwdAnterior;
	}

	public String getPasswdNuevo() {
		return passwdNuevo;
	}

	public void setPasswdNuevo(String passwdNuevo) {
		this.passwdNuevo = passwdNuevo;
	}

	public String getPasswdConfirmacion() {
		return passwdConfirmacion;
	}

	public void setPasswdConfirmacion(String passwdConfirmacion) {
		this.passwdConfirmacion = passwdConfirmacion;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("CambioPassword [passwdAnterior=");
		stringBuilder.append(passwdAnterior);
		stringBuilder.append(", passwdNuevo=");
		stringBuilder.append(passwdNuevo);
		stringBuilder.append(", passwdConfirmacion=");
		stringBuilder.append(passwdConfirmacion);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	
}
