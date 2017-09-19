package br.com.bibliotecaltv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

public class MonitoresDAO {

	// Métodos de inserir dados
	public void realizaEmprestimo(Emprestimo emprestimo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(emprestimo);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	// Fim dos métodos de inserir dados

	// Métodos de buscarPorId
	public Administrador buscarAdministradorPorId(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Administrador administrador = null;
		try {
			Query consulta = session.getNamedQuery("Administrador.buscarPorId");
			consulta.setLong("id", id);
			administrador = (Administrador) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return administrador;
	}

	public Aluno buscarAlunoPorId(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Aluno aluno = null;
		try {
			Query consulta = session.getNamedQuery("Aluno.buscarPorId");
			consulta.setLong("id", id);
			aluno = (Aluno) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return aluno;
	}

	public Genero buscarGeneroPorId(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Genero genero = null;
		try {
			Query consulta = session.getNamedQuery("Genero.buscarPorId");
			consulta.setLong("id", id);
			genero = (Genero) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return genero;
	}

	public Livro buscarLivroPorTombo(Long tombo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Livro livro = null;
		try {
			Query consulta = session.getNamedQuery("Livro.listarPorTombo");
			consulta.setLong("tombo", tombo);
			livro = (Livro) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return livro;
	}

	public Monitores buscarMonitorPorId(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Monitores monitores = null;
		try {
			Query consulta = session.getNamedQuery("Monitores.listarPorId");
			consulta.setLong("id", id);
			monitores = (Monitores) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return monitores;
	}

	public Professor buscarProfessorPorId(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Professor professor = null;
		try {
			Query consulta = session.getNamedQuery("Professor.listarPorId");
			consulta.setLong("id", id);
			professor = (Professor) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return professor;
	}

	public Turma buscarTurmaPorId(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Turma turma = null;
		try {
			Query consulta = session.getNamedQuery("Turma.listarPorId");
			consulta.setLong("id", id);
			turma = (Turma) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return turma;
	}
	public Long buscarTomboLivro(String titulo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long tombo = null;
		try {
			Query consulta = session.getNamedQuery("Livro.buscarTombo");
			consulta.setString("titulo", titulo);
			tombo = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return tombo;
	}

	// Fim dos metodos de buscar por id

	// Métodos de listar dados

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
			Query consulta = sessao
					.getNamedQuery("Emprestimo_Sesc.listarEmprestimo_Sesc");
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
			Query consulta = sessao
					.getNamedQuery("Emprestimo.listarEmprestimo");
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
	// Fim dos métodos de listar dados
	
	// metodos de buscar Id
	public Long buscarIdTurma(String nome) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id_turma = null;
		try {
			Query consulta = session.getNamedQuery("Turma.buscarId");
			consulta.setString("nome", nome);
			id_turma = (Long) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return id_turma;
	}

	public Long buscarIdGenero(String descricao) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id_genero = 0L;
		try {
			Query consulta = session.getNamedQuery("Genero.buscarId");
			consulta.setString("descricao", descricao);
			id_genero = (Long) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return id_genero;
	}

	public Long buscarIdProfessor(String nome_completo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Professor.buscarId");
			consulta.setString("nome_completo", nome_completo);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}

	public Long buscarIdMonitores(String nome) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Monitores.buscarId");
			consulta.setString("nome", nome);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}
	
	public Long buscarIdAluno(String nome){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try{
			Query consulta = session.getNamedQuery("Aluno.buscarId");
			consulta.setString("nome", nome);
			id = (Long) consulta.uniqueResult();
		}catch(RuntimeException e){
			throw e;
		}finally{
			session.close();
		}
		return id;
	}
	public String buscarTomboLivro(String titulo, String autor, Long genero, String editora, Long
			ano_editado, Long volume, String forma_aquisicao, Long exemplares){
		Session session = HibernateUtil.getSessionFactory().openSession();
		String tombo = null;
		try {
			Query consulta = session.getNamedQuery("Livro.buscarTombo");
			consulta.setString("titulo", titulo);
			consulta.setString("autor", autor);
			consulta.setLong("genero_id", genero);
			consulta.setString("editora", editora);
			consulta.setLong("ano_editado", ano_editado);
			consulta.setLong("volume", volume);
			consulta.setString("forma_aquisicao",forma_aquisicao );
			consulta.setLong("exemplares", exemplares);
			tombo = (String) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return tombo;
	}
	public Long buscarIdAdministrador(String usuario, String senha) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id_administrador = 0L;
		try {
			Query consulta = session.getNamedQuery("Administrador.buscarId");
			consulta.setString("usuario", usuario);
			consulta.setString("senha", senha);
			id_administrador = (Long) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return id_administrador;
	}

	// Fim de metodos de buscar id
   
	
	// metodos de alterar dados
	public void realisarDevolucaoEmprestimo(Emprestimo emprestimo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(emprestimo);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void realisarDevolucaoEmprestimo_Sesc(Emprestimo_Sesc emprestimo_sesc) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(emprestimo_sesc);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
}
