package br.com.bibliotecaltv.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;

@Repository
public class MonitoresDAO {
	
	public void realizaEmprestimo(Emprestimo emprestimo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
		    transacao = sessao.beginTransaction();
		    sessao.save(emprestimo);
			transacao.commit();
		} catch(RuntimeException e) {
			if(transacao != null){
				transacao.rollback();
			}
		}finally {
			sessao.close();
		}

	}
	public Livro buscarLivroPorId(Long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Livro tarefa = null;
		try {
			Query consulta = session.getNamedQuery("livros.buscarId");
			consulta.setLong("id", id);
			tarefa = (Livro) consulta.uniqueResult(); 
			
		} catch (RuntimeException e) {
			throw e;
		}finally {
			session.close();
		}
		return tarefa;
	}
}
