package mx.smithseguros.ComunicacionSmith.web.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Valida que sean letras de la A a la Z
	 */
	public static final String SOLO_TEXTO_REGEX = "^[\\pL\\pM\\p{Zs}.-]+$";
	
	private SessionMap<String, Object> session;
	
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}
	
	protected SessionMap<String, Object> getSession(){
		return this.session;
	}
	
	protected void cerrarrSesion(){
		for (Map.Entry<String, Object> entry : session.entrySet()) {
			session.remove( entry.getKey() );
		}
		session.invalidate();
	}
}
