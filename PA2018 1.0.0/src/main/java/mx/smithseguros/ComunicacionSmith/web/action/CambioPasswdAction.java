package mx.smithseguros.ComunicacionSmith.web.action;

import org.apache.log4j.Logger;

import mx.smithseguros.ComunicacionSmith.web.hibernate.Usuario;
import mx.smithseguros.ComunicacionSmith.web.hibernate.UsuarioDAO;
import mx.smithseguros.ComunicacionSmith.web.pojo.CambioPassword;
import mx.smithseguros.ComunicacionSmith.web.pojo.Login;


public class CambioPasswdAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CambioPasswdAction.class);
	
	private CambioPassword cambioPassword;
	
	public String cambiarPassword() {
		logger.debug("Empezará a cambiar la contraseña");
	
		String usuarioS = getSession().get("usuario").toString();
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.login( new Login(usuarioS, cambioPassword.getPasswdAnterior()) );
		
		try {
			if( usuario != null ) {
				usuario.setPassword( cambioPassword.getPasswdNuevo());
				usuarioDAO.updateUsuario(usuario);
				addActionMessage( "Se ha modificado la Contraseña" );
				return "success";
			}else {
				addActionError( "La contraseña no coincide con la anterior" );
				return "passwd-no-cambiado";
			}
		}catch(Exception e) {
			addActionError( e.getMessage() );
			return "error";
		}
	}


	public CambioPassword getCambioPassword() {
		return cambioPassword;
	}

	public void setCambioPassword(CambioPassword cambioPassword) {
		this.cambioPassword = cambioPassword;
	}
}
