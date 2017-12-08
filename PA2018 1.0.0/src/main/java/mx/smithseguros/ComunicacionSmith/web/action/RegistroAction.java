package mx.smithseguros.ComunicacionSmith.web.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import mx.smithseguros.ComunicacionSmith.web.hibernate.Usuario;
import mx.smithseguros.ComunicacionSmith.web.hibernate.UsuarioDAO;


public class RegistroAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(RegistroAction.class);

	private Usuario usuario;
	private String passwordConfirn;

	public String registroUsuario() {
		logger.info("registroUsuario()");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.saveUsuario( usuario );
		logger.info("Usuario guardado exitosamente");
		
		return "success";
	}
	
	public void validate(){
		
		if( usuario.getUsuario() == null || usuario.getUsuario().isEmpty() ) {
			logger.warn("No se recibió correo");
			addFieldError("usuario.mail", "El usuario es requerido");
		}
		
		if( usuario.getNombre() == null || usuario.getNombre().isEmpty() ) {
			addFieldError("usuario.nombre", "Nombre es requerido");
		}
		
		if( !usuario.getNombre().matches(SOLO_TEXTO_REGEX) ) {
			addFieldError("usuario.nombre", "Nombre inválido");
		}
		
		if( usuario.getApPaterno() == null || usuario.getApPaterno().isEmpty() ) {
			addFieldError("usuario.apPaterno", "Apellido paterno requerido");
		}
		
		if( !usuario.getApPaterno().matches(SOLO_TEXTO_REGEX) ) {
			addFieldError("usuario.apPaterno", "Apellido paterno inválido");
		}
		
		if( ( usuario.getApMaterno() != null && !usuario.getApMaterno().isEmpty() ) && 
				!usuario.getApMaterno().matches(SOLO_TEXTO_REGEX) ) {
			addFieldError("usuario.apMaterno", "Apellido materno inválido");
		}
		
		if( usuario.getPassword() == null || usuario.getPassword().isEmpty() ) {
			addFieldError("usuario.password", "Contraseña requerida");
		}
		
		
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getPasswordConfirn() {
		return passwordConfirn;
	}

	public void setPasswordConfirn(String passwordConfirn) {
		this.passwordConfirn = passwordConfirn;
	}
}
