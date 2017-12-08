package mx.smithseguros.ComunicacionSmith.web.action;

import org.apache.log4j.Logger;


import mx.smithseguros.ComunicacionSmith.web.hibernate.Folio;
import mx.smithseguros.ComunicacionSmith.web.hibernate.FolioDAO;


public class RegistroFolio extends BaseAction{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(RegistroAction.class);

	private Folio folio;

	public String registroFolio() {
		logger.info("Creando folio");
		
		FolioDAO folioDAO = new FolioDAO();
		folioDAO.saveFolio(folio);
		logger.info("Folio guardado");
		
		return "success";
	}
	
	public String registroFolioRespuesta() {
		logger.info("Creando respuesta()");
		
		FolioDAO folioDAO = new FolioDAO();
		folioDAO.saveFolio(folio);
		logger.info("Respuesta guardada");
		
		return "success";
	}
	
	public void validate(){
		
		if( folio.getIdReceptor() == null || folio.getIdReceptor().isEmpty() ) {
			logger.warn("No se recibió correo");
			addFieldError("usuario.mail", "El usuario es requerido");
		}
		
		if( folio.getTitulo() == null || folio.getTitulo().isEmpty() ) {
			addFieldError("usuario.nombre", "Nombre es requerido");
		}
		
		if( folio.getDetalles() == null || folio.getDetalles().isEmpty() ) {
			addFieldError("usuario.nombre", "Nombre es requerido");
		}
		
	}

	public Folio getFolio() {
		return folio;
	}

	public void setFolio(Folio folio) {
		this.folio = folio;
	}

}