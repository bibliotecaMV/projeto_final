package br.com.bibliotecaltv.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;

public abstract class GenericDAO<T, I extends Serializable> {
	Session session = HibernateUtil.getSession();

	public T salvar(T entity) {
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
		}
		return null;
	}

	public void excluir(T entity) {
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
		}
	}

	public void alterar(T entity) {
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(entity);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> listar(Class<T> classe) {
		Transaction transaction = null;
		List<T> lista = null;
		try {
			transaction = session.beginTransaction();
			Criteria selectAll = session.createCriteria(classe);
			transaction.commit();
			lista = selectAll.list();
		} catch (RuntimeException e) {
			throw e;
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	public T listarPorId(Class<T> classe, Long pk) throws Exception {
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			T entity = (T) session.load(classe, pk);
			session.flush();
			transaction.commit();
			return entity;
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean realizarLoginUsuario(String classe, String usuario, String senha) {
		Transaction transaction = null;
		T entity = null;
		try {
			transaction = session.beginTransaction();
			Query consulta = session.getNamedQuery(classe + ".realizarLogin");
			consulta.setString("usuario", usuario);
			consulta.setString("senha", senha);
			entity = (T) consulta.uniqueResult();
			transaction.commit();
		} catch (RuntimeException e) {
			throw e;
		}
		if (entity == null) {
			return false;
		} else {
			return true;
		}

	}

	public Long listarIdPorNome(String classe, String nome) {
		Transaction transaction = null;
		Long id = null;
		try {
			transaction = session.beginTransaction();
			Query consulta = session.getNamedQuery(classe + ".listarIdPorNome");
			consulta.setString("nome", nome);
			id = (Long) consulta.uniqueResult();
			transaction.commit();
		} catch (RuntimeException e) {
			throw e;
		}
		return id;
	}
	

	@SuppressWarnings("unchecked")
	public List<T> listarPorFK(String classe, Long fk, String campo) {
		Transaction transaction = null;
		List<T> lista = null;
		try {
			transaction = session.beginTransaction();
			Query consulta = session.getNamedQuery(classe + ".listarPorFK");
			consulta.setLong(campo, fk);
			lista = consulta.list();
			transaction.commit();
		} catch (RuntimeException e) {
			throw e;
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<T> listarNotNullEntidade
		(String classe, String complemento){
			Transaction transaction = null;
			List<T> lista = null;
			try{
				transaction = session.beginTransaction();
				Query consulta = session.getNamedQuery(classe+".listarNotNull"+complemento);
				lista = consulta.list();
				transaction.commit();
			}catch(RuntimeException e){
				throw e;
			}
			return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listarEntidadePorNome
	(String classe, String nome) {
		Transaction transaction = null;
		List<T> lista = null;
		try{
			transaction = session.beginTransaction();
			Query consulta = session.createQuery("select professor from Professor professor where nome"
					+ " like '"+nome+"%'");
			lista = consulta.list();
			transaction.commit();
		}catch(RuntimeException e){
			throw e;
		}
		return lista;
}
	
	@SuppressWarnings("unchecked")
	public List<T> listarEntidadePorUsuario
	(String classe, String usuario) {
		Transaction transaction = null;
		List<T> lista = null;
		try{
			transaction = session.beginTransaction();
			Query consulta = session.createQuery("select monitores from Monitores monitores where usuario"
					+ " like '"+usuario+"%'");
			lista = consulta.list();
			transaction.commit();
		}catch(RuntimeException e){
			throw e;
		}
		return lista;
}

}