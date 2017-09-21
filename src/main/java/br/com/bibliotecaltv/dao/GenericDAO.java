package br.com.bibliotecaltv.dao;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;


public abstract class GenericDAO<T, I extends Serializable> {


   public T salvar(T entity) {
	   Session session = HibernateUtil.getSessionFactory().openSession();
	   Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			return entity;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
   }
   
   public void excluir(T entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(entity);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
   
   public void alterar(T entity) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.update(entity);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
		} finally {
			sessao.close();
		}
	}
   

}