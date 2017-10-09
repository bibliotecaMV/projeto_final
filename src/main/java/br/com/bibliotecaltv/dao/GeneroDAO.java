package br.com.bibliotecaltv.dao;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Genero;

@Repository
public class GeneroDAO extends GenericDAO<Genero, Long> {
	public Long listarIdPorNome(String classe, String descricao) {
		Transaction transaction = null;
		Long id = null;
		try {
			transaction = session.beginTransaction();
			Query consulta = session.getNamedQuery(classe + ".listarIdPorNome");
			consulta.setString("descricao", descricao);
			id = (Long) consulta.uniqueResult();
			transaction.commit();
		} catch (RuntimeException e) {
			throw e;
		}
		return id;
	}
}
