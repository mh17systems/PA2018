package mx.smithseguros.ComunicacionSmith.web.action;

import org.apache.log4j.Logger;

import mx.smithseguros.ComunicacionSmith.web.hibernate.Usuario;
import mx.smithseguros.ComunicacionSmith.web.hibernate.UsuarioDAO;
import mx.smithseguros.ComunicacionSmith.web.pojo.Login;

public class LoginAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(LoginAction.class);
	private Login login;
	
	
	public String loginUsuario() {
		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			Usuario usuario = usuarioDAO.login(login);
		
			if( usuario == null ){ 
				addActionError("Usuario Y/O contraseña inválidos, intente de nuevo");
				return "not-found";
			}

			getSession().put("nombreCompleto", usuario.getNombreCompleto());
			getSession().put("tipo", usuario.getTipo());
			getSession().put("usuario", usuario.getUsuario());
			return "success";
		}catch(Exception e) {
			addActionError(e.getMessage());
			return "error";
		}
	}
	
	public String logoutUsuario() {
		logger.info("Sesión cerrada");
		cerrarrSesion();
		addActionMessage("La sesión ha sido cerrada");
		return "success";
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	
}
