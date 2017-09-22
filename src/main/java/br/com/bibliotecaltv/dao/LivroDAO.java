package br.com.bibliotecaltv.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;

public class LivroDAO extends GenericDAO<Livro, Long> {
	public Livro listarPorId(Class<Livro> classe, String pk) throws Exception{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Livro livro = (Livro) session.load(classe, pk);
			session.flush();
			transaction.commit();
			return  livro;
		}catch(RuntimeException e){
			throw e;
		}
	}

}
