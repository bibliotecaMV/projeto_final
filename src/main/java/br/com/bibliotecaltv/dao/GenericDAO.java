package br.com.bibliotecaltv.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
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
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(entity);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	@SuppressWarnings("unchecked")
	public List<T> listar(Class<T> classe){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<T> lista = null;
		try{
			transaction = session.beginTransaction();
			Criteria selectAll = session.createCriteria(classe);
			transaction.commit();
			lista = selectAll.list();
		}catch(RuntimeException e){
			throw e;
		}finally{
			session.close();
		}
		return lista;
	}
	@SuppressWarnings("unchecked")
	public T listarPorId(Class<T> classe, Long pk) throws Exception{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			T entity = (T) session.load(classe, pk);
			session.flush();
			transaction.commit();
			return  entity;
		}catch(RuntimeException e){
			throw e;
		}
	}

}