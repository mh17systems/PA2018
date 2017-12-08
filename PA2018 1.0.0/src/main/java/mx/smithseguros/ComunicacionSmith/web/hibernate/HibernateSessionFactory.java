package mx.smithseguros.ComunicacionSmith.web.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class HibernateSessionFactory {
	private static final Logger logger = Logger.getLogger(HibernateSessionFactory.class);
	
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    private static org.hibernate.SessionFactory sessionFactory;
	
    private static Configuration configuration = new Configuration();
    private static ServiceRegistry serviceRegistry; 
    
    static {
    	try {
			configuration.configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			System.err.println("Error en el manejo de la sesión con hibernate");
			e.printStackTrace();
			logger.error("Error en el manejo de la sesión con hibernate", e);
		}
    }
    
    private HibernateSessionFactory() {
    }
	
    public static Session getSession(){
        Session session = (Session) threadLocal.get();

		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			session = (sessionFactory != null) ? sessionFactory.openSession()
					: null;
			threadLocal.set(session);
		}
        return session;
    }

	public static void rebuildSessionFactory(){
		try {
			configuration.configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			System.err.println("Error en la reconstrucción de la sesión");
			e.printStackTrace();
			logger.error("Error en la reconstrucción de la sesión", e);
		}
	}

    public static void closeSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }

	public static org.hibernate.SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Configuration getConfiguration() {
		return configuration;
	}

}
