package br.com.bibliotecaltv.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import org.springframework.stereotype.Repository;
import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;



@Repository
public class MonitoresDAO {

	
	public void realizaEmprestimo(Emprestimo emprestimo){
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

	
	public Long buscarIdLivro(String titulo){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = 0L;
		try{
			Query consulta = session.getNamedQuery("livros.buscarLivro");
			consulta.setString("CDD", titulo );
			id = (Long) consulta.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return id;
	}
	
	
	
	public Aluno buscarAlunoPorId(Long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Aluno aluno = null;
		try {
			Query consulta = session.getNamedQuery("alunos.buscarId");
			consulta.setLong("id", id);
			aluno = (Aluno) consulta.uniqueResult(); 
			
		} catch (RuntimeException e) {
			throw e;
		}finally {
			session.close();
		}
		return aluno;
	}
	
	
	public Long buscarIdAluno(String nome){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = 0L;
		try{
			Query consulta = session.getNamedQuery("alunos.buscarAluno");
			consulta.setString("nome", nome );
			id = (Long) consulta.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return id;
	}
	
	
	
	public Turma buscarTurmaPorId(Long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Turma turma = null;
		try {
			Query consulta = session.getNamedQuery("turmas.buscarId");
			consulta.setLong("id", id);
			turma = (Turma) consulta.uniqueResult(); 
			
		} catch (RuntimeException e) {
			throw e;
		}finally {
			session.close();
		}
		return turma;
	}
	
	
	public Long buscarIdTurma(String turma){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = 0L;
		try{
			Query consulta = session.getNamedQuery("turmas.buscarTurma");
			consulta.setString("turma", turma );
			id = (Long) consulta.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return id;
	}
	
	
	public Long buscarIdGenero(String descricao){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = 0L;
		try{
			Query consulta = session.getNamedQuery("Genero.pegarId");
			consulta.setString("descrica", descricao);
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
	
	
	public Long buscarIdProfessor(String nomeCompleto){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = 0L;
		try{
			Query consulta = session.getNamedQuery("professor.pegarId");
			consulta.setString("Nome", nomeCompleto);
			id = (Long) consulta.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return id;
	}
	
	public Professor buscarProfessorPorId(Long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Professor professor = null;
		try{
			Query consulta = session.getNamedQuery("Genero.buscarGenero");
			consulta.setLong("id", id);
			professor = (Professor) consulta.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return professor;
	}
	@SuppressWarnings("unchecked")

	public List<Aluno> listarAluno() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Aluno> aluno = null;
		try {
			Query consulta = sessao.getNamedQuery("Aluno.listarAluno");
			aluno = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return aluno;

	}

	@SuppressWarnings("unchecked")
	public List<Emprestimo_Sesc> listarEmprestimo_Sesc() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Emprestimo_Sesc> emprestimo_sesc = null;

		try {
			Query consulta = sessao.getNamedQuery("Emprestimo_Sesc.listarEmprestimo_Sesc");
			emprestimo_sesc = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {
			sessao.close();
		}
		return emprestimo_sesc;

	}

	@SuppressWarnings("unchecked")
	public List<Emprestimo> listarEmprestimo() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Emprestimo> emprestimo = null;

		try {
			Query consulta = sessao.getNamedQuery("Emprestimo.listarEmprestimo");
			emprestimo = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {

			sessao.close();

		}
		return emprestimo;

	}

	@SuppressWarnings("unchecked")
	public List<Genero> listarGenero() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Genero> genero = null;

		try {

			Query consulta = sessao.getNamedQuery("Genero.listarGenero");
			genero = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {
			sessao.close();

		}
		return genero;

	}

	@SuppressWarnings("unchecked")
	public List<Livro> listarLivro() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Livro> livro = null;

		try {

			Query consulta = sessao.getNamedQuery("Livro.listarLivro");
			livro = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {
			sessao.close();

		}
		return livro;

	}

	@SuppressWarnings("unchecked")
	public List<Professor> listarProfessor() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Professor> professor = null;

		try {

			Query consulta = sessao.getNamedQuery("Professor.listarProfessor");
			professor = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {

			sessao.close();

		}
		return professor;

	}

	@SuppressWarnings("unchecked")
	public List<Turma> listarTurma() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Turma> turma = null;

		try {

			Query consulta = sessao.getNamedQuery("Turma.listarTurma");
			turma = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {

			sessao.close();

		}
		return turma;

	}
}
