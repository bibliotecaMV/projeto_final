package br.com.bibliotecaltv.dao;

import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Livro;

@Repository
public class LivroDAO extends GenericDAO<Livro, Long> {
	public Livro listarPorId(Class<Livro> classe, String pk) throws Exception{
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
