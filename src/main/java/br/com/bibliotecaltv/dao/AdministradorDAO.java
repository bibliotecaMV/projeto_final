package br.com.bibliotecaltv.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
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
	public void inserirAdministrador (Administrador administrador) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		try {
			sessao.save(administrador);
		} catch(RuntimeException e) {
			
		}finally {
			sessao.close();
		}

	}
	
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
		List<Professor> prof = null;

		try {
			
			Query consulta = sessao.getNamedQuery("Professor.listarProfessor");
			prof = consulta.list();
			
		} catch(RuntimeException e) {
			throw e;

		}finally {
			sessao.close();

		}
		return prof;

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
}
