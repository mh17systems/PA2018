package mx.smithseguros.ComunicacionSmith.web.pojo;

public class ResponseFolio {
	private String idFolio;
	
	public ResponseFolio() {};
	
	public ResponseFolio(String idFolio) {
		this.setIdFolio(idFolio);
	}
	public String getIdFolio() {
		return idFolio;
	}

	public void setIdFolio(String idFolio) {
		this.idFolio = idFolio;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("ResponseFolio [idFolio=");
		stringBuilder.append(idFolio);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	
	
}
