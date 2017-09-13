package br.com.biblioteca.sessions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static Session session;

	private static SessionFactory buildSessionFactory() {

		try {
		
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry serviceResgistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceResgistry);
			
			session = sessionFactory.openSession();

			return sessionFactory;
		} catch (Throwable ex) {
			// Falha na criação da sessão
			System.err.println("A sessão falhou." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static Session getSession() {
		return session;
	}

}
