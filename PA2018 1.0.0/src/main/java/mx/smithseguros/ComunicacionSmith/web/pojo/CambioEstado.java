package mx.smithseguros.ComunicacionSmith.web.pojo;


public class CambioEstado {
	private String estadoAnterior;
	private String estadoNuevo;
	
	public String getEstadoNuevo() {
		return estadoNuevo;
	}


	public void setEstadoNuevo(String estadoNuevo) {
		this.estadoNuevo = estadoNuevo;
	}


	public String getEstadoAnterior() {
		return estadoAnterior;
	}


	public void setEstadoAnterior(String estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("CambioPassword [passwdAnterior=");
		stringBuilder.append(estadoAnterior);
		stringBuilder.append(", passwdNuevo=");
		stringBuilder.append(estadoNuevo);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
}
