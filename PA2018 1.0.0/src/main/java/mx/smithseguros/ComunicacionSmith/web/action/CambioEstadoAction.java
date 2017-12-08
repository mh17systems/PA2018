package mx.smithseguros.ComunicacionSmith.web.action;

import org.apache.log4j.Logger;

import mx.smithseguros.ComunicacionSmith.web.hibernate.Folio;
import mx.smithseguros.ComunicacionSmith.web.hibernate.FolioDAO;
import mx.smithseguros.ComunicacionSmith.web.hibernate.Usuario;
import mx.smithseguros.ComunicacionSmith.web.hibernate.UsuarioDAO;
import mx.smithseguros.ComunicacionSmith.web.pojo.CambioEstado;
import mx.smithseguros.ComunicacionSmith.web.pojo.CambioPassword;
import mx.smithseguros.ComunicacionSmith.web.pojo.Login;


public class CambioEstadoAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(CambioEstadoAction.class);
	
	public String finalizar() {
		logger.debug("Ya empezó el Finalizar");
		FolioDAO folioDAO = new FolioDAO();
		Folio folio = folioDAO.obtenerPorId(getSession().get("folioActual").toString());
		
		try {
			if( folio != null ) {
				folio.setStat("F");   
				folioDAO.updateFolio(folio);
				return "success";
			}else {
				addActionError( "Error, no se puede finalizar el folio" );
				return "passwd-no-cambiado";
			}
		}catch(Exception e) {
			addActionError( e.getMessage() );
			return "error";
		}
	}
	
}
