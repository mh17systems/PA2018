package mx.smithseguros.ComunicacionSmith.web.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.smithseguros.ComunicacionSmith.web.pojo.Login;

public class FolioDAO extends BaseHibernateDAO{
	public List<Object> getAllFolios(){
		return findAll(Folio.class);
	}
	
	public List<Object> getActiveFolios(String nombre){
		
		Criteria criteria = getSession().createCriteria(Folio.class)
				.add( Restrictions.and(Restrictions.eq("idRelacion", "0"),Restrictions.and(Restrictions.eq("stat", "A"),Restrictions.or(Restrictions.eq("idReceptor", nombre),(Restrictions.or(Restrictions.eq("idEmisor", nombre), Restrictions.eq("idReceptor", "Todos")))))));
		return findByCriteria(criteria);		
	}
	
public List<Object> getActiveFoliosDetalles(String nombre, String idRelacion){
		
		Criteria criteria = getSession().createCriteria(Folio.class)
				.add( Restrictions.and(Restrictions.eq("idRelacion", idRelacion),Restrictions.and(Restrictions.eq("stat", "A"),Restrictions.or(Restrictions.eq("idReceptor", nombre), Restrictions.eq("idReceptor", "Todos")))));
		return findByCriteria(criteria);		
	}

public Folio obtenerPorId(String idFolio) {
	Criteria criteria = getSession().createCriteria(Folio.class)
			.add( Restrictions.eq("idFolio", idFolio));
	return (Folio) criteria.uniqueResult();
}
	
	public void saveFolio(Folio folio) {
		super.save(folio);
	}
	
	public void updateFolio(Folio folio) {
		super.saveOrUpdate(folio);
	}
	
}
