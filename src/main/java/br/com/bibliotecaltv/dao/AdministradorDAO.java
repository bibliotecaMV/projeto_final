package br.com.bibliotecaltv.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
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
	
	
	public void adicionarGenero(Genero genero){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(genero);
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}	
	}
	
	
	public Long buscarIdGenero(String descricao){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = 0L;
		try{
			Query consulta = session.getNamedQuery("Genero.pegarId");
			consulta.setString("descricao", descricao);
			id = (Long) consulta.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return id;
	}
	
	
	public Genero buscarGeneroPorId(Long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Genero genero = null;
		try{
			Query consulta = session.getNamedQuery("Genero.buscarGenero");
			consulta.setLong("id", id);
			genero = (Genero) consulta.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return genero;
	}
	
	
	public void adicionarLivro(Livro livro){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(livro);
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}	
	}
}
