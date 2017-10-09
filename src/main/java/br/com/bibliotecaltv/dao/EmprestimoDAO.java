package br.com.bibliotecaltv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;

@Repository
public class EmprestimoDAO extends GenericDAO<Emprestimo, Long> {
	@SuppressWarnings("unchecked")
	public List<Emprestimo> listarNotNullEntidade
		(String classe, String complemento, Long campo1, String descricao1, Long campo2, String descricao2){
			Transaction transaction = null;
			List<Emprestimo> lista = null;
			try{
				transaction = session.beginTransaction();
				Query consulta = session.getNamedQuery(classe+".listarNotNull"+complemento);
				consulta.setLong(descricao1, campo1);
				if((campo2 != null) && (descricao2 != null)){
					consulta.setLong(descricao2, campo2);
				}
				lista = consulta.list();
				transaction.commit();
			}catch(RuntimeException e){
				throw e;
			}
			return lista;
	}
}
