package br.com.bibliotecaltv.dao;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Aluno;

@Repository
public class AlunoDAO extends GenericDAO<Aluno, Long>{
	public Long listarIdPorNomeTurma(String classe, String nome, Long turma_id){
		Transaction transaction = null;
		Long id = null;
		try{
			transaction = session.beginTransaction();
			Query consulta = session.getNamedQuery(classe + ".listarIdPorNomeTurma");
			consulta.setString("nome", nome);
			consulta.setLong("turma_id", turma_id);
			id = (Long) consulta.uniqueResult();
			transaction.commit();
		}catch(RuntimeException e){
			throw e;
		}
		return id;
	}
}
