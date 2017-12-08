package mx.smithseguros.ComunicacionSmith.web.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import mx.smithseguros.ComunicacionSmith.web.pojo.Login;

public class UsuarioDAO extends BaseHibernateDAO{
	public Usuario login(Login login) {
		Criteria criteria = getSession().createCriteria(Usuario.class)
				.add( Restrictions.eq("usuario", login.getUsuario()) )
				.add( Restrictions.eq("password", login.getPassword()) );
		return (Usuario) criteria.uniqueResult();
	}
	
	public List<Object> getAllUsers(){
		return findAll(Usuario.class);
	}
	
	public void saveUsuario(Usuario usuario) {
		super.save(usuario);
	}
	
	public void updateUsuario(Usuario usuario) {
		super.saveOrUpdate(usuario);
	}
}
