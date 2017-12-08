package mx.smithseguros.ComunicacionSmith.web.action;

import org.apache.log4j.Logger;

import mx.smithseguros.ComunicacionSmith.web.hibernate.Usuario;
import mx.smithseguros.ComunicacionSmith.web.hibernate.UsuarioDAO;
import mx.smithseguros.ComunicacionSmith.web.pojo.Login;
import mx.smithseguros.ComunicacionSmith.web.pojo.ResponseFolio;

public class ResponderAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(ResponderAction.class);
	private ResponseFolio responseFolio;
	
	
	public String responder() {
		try {
			getSession().put("folioActual", responseFolio.getIdFolio());
			return "success";
		}catch(Exception e) {
			addActionError(e.getMessage());
			return "error";
		}
	}
	public ResponseFolio getResponseFolio() {
		return responseFolio;
	}

	public void setResponseFolio(ResponseFolio responseFolio) {
		this.responseFolio = responseFolio;
	}

	
}
