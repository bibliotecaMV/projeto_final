package br.com.bibliotecaltv.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;

@Repository
public class AdministradorDAO {
	
	public void adicionarAdministrador(Administrador administrador){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(administrador);
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}	
	}
	public void adicionarMonitor(Monitores monitores){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(monitores);
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}	
	}
}
