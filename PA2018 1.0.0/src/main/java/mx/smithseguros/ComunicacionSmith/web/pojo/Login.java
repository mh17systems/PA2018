package mx.smithseguros.ComunicacionSmith.web.pojo;

public class Login {
	private String usuario;
	private String password;
	
	public Login() {};
	
	public Login(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Login [usuario=");
		stringBuilder.append(usuario);
		stringBuilder.append(", password=");
		stringBuilder.append(password);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	
}
