package br.com.bibliotecaltv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;

@Repository
public class AdministradorDAO {


	//Métodos de excluir dados
	public void excluir(Aluno aluno) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(aluno);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void excluir(Professor professor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(professor);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void excluir(Monitores monitores){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(monitores);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void excluir(Administrador administrador){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(administrador);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void excluir(Emprestimo emprestimo ){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(emprestimo);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void excluir(Emprestimo_Sesc emprestimo_sesc){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(emprestimo_sesc);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void excluir(Genero genero){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(genero);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void excluir(Livro livro){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(livro);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void excluir(Turma turma){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(turma);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		} finally {
			session.close();
		}

	}

	//Fim dos métodos de excluir dados
	
	//Listando Todos As Classes//
	@SuppressWarnings("unchecked")
	public List<Administrador> listarAdministrador(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Administrador> administrador = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Administrador.listarAdministrador");
			administrador = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return administrador;

	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> listarAluno(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Aluno> aluno = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Aluno.listarAluno");
			aluno = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return aluno;

	}
	
	@SuppressWarnings("unchecked")
	public List<Emprestimo_Sesc> listarEmprestimo_Sesc(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Emprestimo_Sesc> emprestimo_sesc = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Emprestimo_Sesc.listarEmprestimo_Sesc");
			emprestimo_sesc = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return emprestimo_sesc;

	}
	
	@SuppressWarnings("unchecked")
	public List<Emprestimo> listarEmprestimo(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Emprestimo> emprestimo = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Emprestimo.listarEmprestimo");
			emprestimo = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return emprestimo;

	}
	
	@SuppressWarnings("unchecked")
	public List<Genero> listarGenero(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Genero> genero = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Genero.listarGenero");
			genero = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return genero;

	}
	
	@SuppressWarnings("unchecked")
	public List<Livro> listarLivro(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Livro> livro = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Livro.listarLivro");
			livro = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return livro;

	}
	
	@SuppressWarnings("unchecked")
	public List<Monitores> listarMonitores(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Monitores> monitores = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Monitores.listarMonitores");
			monitores = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return monitores;

	}
	
	@SuppressWarnings("unchecked")
	public List<Professor> listarProfessor(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Professor> professor = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Professor.listarProfessor");
			professor = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return professor;

	}
	
	@SuppressWarnings("unchecked")
	public List<Turma> listarTurma(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Turma> turma = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Turma.listarTurma");
			turma = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return turma;
	}
	public void adicionarAdministrador(Administrador administrador){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(administrador);
			transaction.commit();
		}catch(Exception e){
			if(transaction != null) {
				transaction.rollback();
				}
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
			if(transaction != null) {
				transaction.rollback();
				}
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
			if(transaction != null) {
				transaction.rollback();
				}
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
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		}finally{
			session.close();
		}	
	}
	public void realizarEmprestimo(Emprestimo emprestimo){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(emprestimo);
			transaction.commit();
		}catch(Exception e){
			if(transaction != null) {
				transaction.rollback();
				}
				e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
