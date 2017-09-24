package br.com.bibliotecaltv.sessaoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	private static Session session = null;

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null){
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry serviceResgistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceResgistry);
			return sessionFactory;
		}else{
			return sessionFactory;
		}
	}
	
	public static Session getSession() {
		if(session == null){
			if(sessionFactory == null){
				Configuration configuration = new Configuration();
				configuration.configure();
				ServiceRegistry serviceResgistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceResgistry);
				session = sessionFactory.openSession();
				return session;
			}else{
				session = sessionFactory.openSession();
				return session;
			}
		}else{
			return session;
		}
	}

}