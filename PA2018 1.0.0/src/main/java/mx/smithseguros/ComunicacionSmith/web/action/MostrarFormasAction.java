package mx.smithseguros.ComunicacionSmith.web.action;

import java.util.List;
import org.apache.log4j.Logger;
import mx.smithseguros.ComunicacionSmith.web.hibernate.Folio;
import mx.smithseguros.ComunicacionSmith.web.hibernate.FolioDAO;
import mx.smithseguros.ComunicacionSmith.web.hibernate.Usuario;
import mx.smithseguros.ComunicacionSmith.web.hibernate.UsuarioDAO;
import mx.smithseguros.ComunicacionSmith.web.pojo.CambioPassword;
import mx.smithseguros.ComunicacionSmith.web.pojo.Login;

public class MostrarFormasAction extends BaseAction {
	private static final Logger logger = Logger.getLogger(MostrarFormasAction.class);
	
	private Login login;
	private Usuario usuario;
	private CambioPassword cambioPassword;
	
	private Folio folio;
	private List<Folio> folios;
	private List<Usuario> usuarios;
	private String idRealacion;
	

	public String showLoginForm() {
		logger.info("showLoginForm()");
		
		login = new Login();
		
		return "success";
	}

	public String showRegisterForm() {
		
		usuario = new Usuario();
		
		return "success";
	}
	
	public String showCreateTicket() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		setUsuarios((List<Usuario>)(Object)usuarioDAO.getAllUsers());
		return "success";
	}
	
	public String showResponseTicket() {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		setUsuarios((List<Usuario>)(Object)usuarioDAO.getAllUsers());
		
		return "success";
	}
	
	public String showChangePasswordForm(){
		logger.info("showChangePasswordForm()");
		cambioPassword = new CambioPassword();
		return "success";
	}
	
	public String showHome(){
		return "success";
	}
	
	public String showFoliosForm() {
		FolioDAO folioDAO = new FolioDAO();
		if(getSession().get("usuario").toString() == null) {
			folios = (List<Folio>)(Object)folioDAO.getActiveFolios("Vacio");
		}
		else {
		folios = (List<Folio>)(Object)folioDAO.getActiveFolios( getSession().get("usuario").toString());
		}
		return "success";
	}
	
	public String showFoliosDetailForm() {
		FolioDAO folioDAO = new FolioDAO();
		
		if(getSession().get("usuario").toString() == null) {
			folios = (List<Folio>)(Object)folioDAO.getActiveFoliosDetalles("Vacio","nada");
		}
		else {
		folios = (List<Folio>)(Object)folioDAO.getActiveFoliosDetalles( getSession().get("usuario").toString(),folio.getIdRelacion());
		}
		getSession().put("folioActual", folio.getIdRelacion());
		return "success";
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public CambioPassword getCambioPassword() {
		return cambioPassword;
	}

	public void setCambioPassword(CambioPassword cambioPassword) {
		this.cambioPassword = cambioPassword;
	}

	public List<Folio> getFolios() {
		return folios;
	}

	public void setFolios(List<Folio> folios) {
		this.folios = folios;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String getIdRealacion() {
		return idRealacion;
	}

	public void setIdRealacion(String idRealacion) {
		this.idRealacion = idRealacion;
	}

	public Folio getFolio() {
		return folio;
	}

	public void setFolio(Folio folio) {
		this.folio = folio;
	}
}
