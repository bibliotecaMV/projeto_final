package br.com.bibliotecaltv.dao;

import java.util.Date;
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

public class AdministradorDAO extends GenericDAO<Administrador, Long> {

	// Métodos de excluir dados
	public void excluirAluno(Aluno aluno) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(aluno);
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

	public void excluirProfessor(Professor professor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(professor);
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

	public void excluirMonitores(Monitores monitores) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(monitores);
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

	public void excluirAdministradores(Administrador administrador) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(administrador);
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

	public void excluirGenero(Genero genero) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(genero);
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

	public void excluirLivro(Livro livro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(livro);
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

	public void excluirTurma(Turma turma) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(turma);
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

	// Fim dos métodos de excluir dados
	// --------------------------------------------------------------------------------------------------------------------------

	// Listando Todos As Classes//
	@SuppressWarnings("unchecked")
	public List<Administrador> listarAdministrador() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Administrador> administrador = null;

		try {

			Query consulta = sessao
					.getNamedQuery("Administrador.listarAdministrador");
			administrador = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {
			sessao.close();

		}
		return administrador;

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
	public List<Monitores> listarMonitores() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Monitores> monitores = null;

		try {

			Query consulta = sessao.getNamedQuery("Monitores.listarMonitores");
			monitores = consulta.list();

		} catch (RuntimeException e) {
			throw e;

		} finally {
			sessao.close();

		}
		return monitores;

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

	// Fim dos métodos de listar classes

	// Métodos de inserir dados
	public void adicionarAdministrador(Administrador administrador) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(administrador);
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

	public void adicionarMonitor(Monitores monitores) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(monitores);
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

	public void adicionarGenero(Genero genero) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(genero);
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

	public void adicionarAluno(Aluno aluno) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(aluno);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void adicionarLivro(Livro livro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(livro);
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

	public void adicionarTurma(Turma turma) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(turma);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void realizarEmprestimo(Emprestimo emprestimo) {
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

	public void realizarEmprestimo_Sesc(Emprestimo_Sesc emprestimo_sesc) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(emprestimo_sesc);
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

	public void adicionarProfessor(Professor professor) {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(professor);
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

	public Emprestimo buscarEmprestimoPorId(Long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Emprestimo emprestimo = null;
		try{
			Query consulta = session.getNamedQuery("Emprestimo.buscarPorId");
			consulta.setLong("id", id);
			emprestimo = (Emprestimo) consulta.uniqueResult();
		}catch(RuntimeException e){
			throw e;
		}finally{
			session.close();
		}
		return emprestimo;
	}
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
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return genero;
	}


	public Livro buscarLivroPorTombo(String tombo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Livro livro = null;
		try {
			Query consulta = session.getNamedQuery("Livro.listarPorTombo");
			consulta.setString("tombo", tombo);
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

	// Fim dos métodos de buscasPorId

	// Metodos de alterar dados//
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

	public void alterarAdministrador(Administrador administrador) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(administrador);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
		} finally {
			sessao.close();
		}
	}

	public void alterarAluno(Aluno aluno) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(aluno);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
		} finally {
			sessao.close();
		}
	}

	public void alterarGenero(Genero genero) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(genero);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
		} finally {
			sessao.close();
		}
	}

	public void alterarLivro(Livro livro) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(livro);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
		} finally {
			sessao.close();
		}
	}

	public void alterarMonitores(Monitores monitores) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(monitores);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
		} finally {
			sessao.close();
		}
	}

	public void alterarProfessor(Professor professor) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(professor);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
		} finally {
			sessao.close();
		}
	}

	public void alterarTurma(Turma turma) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(turma);
			transacao.commit();
		} catch (RuntimeException e) {
			if (transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		} finally {
			sessao.close();
		}
	}

	// Fim Do Alterar//

	// Métodos de buscar o Id

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
	public Long buscarIdAluno(String nome, Long numero, String matricula) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Aluno.buscarId");
			consulta.setString("nome", nome);
			consulta.setLong("numero", numero);
			consulta.setString("matricula", matricula);
			id = (Long) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		return id;
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

	public Long buscarIdProfessor(String nome_completo, String matricula) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Professor.buscarId");
			consulta.setString("nome_completo", nome_completo);
			consulta.setString("matricula", matricula);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}

	public Long buscarIdMonitores(String nome, String senha) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Monitores.buscarId");
			consulta.setString("nome", nome);
			consulta.setString("senha", senha);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}

	public Long buscarIdEmprestimo_SescAluno( String tombo, Long genero,Long turma, 
			Long aluno, String dataEmprestimo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Emprestimo_Sesc.buscarIdAluno");
			consulta.setString("livro_tombo",tombo);
			consulta.setLong("genero_id", genero);
			consulta.setLong("aluno_id", aluno);
			consulta.setLong("turma_id", turma);
			consulta.setString("dataEmprestimo",dataEmprestimo);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}


	public Long buscarIdEmprestimo_SescProfessor( String tombo, String genero, Long professor, Date data_emprestimo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Emprestimo_Sesc.buscarIdProfessor");
			consulta.setString("tombo",tombo);
			consulta.setString("genero", genero);
			consulta.setLong("professor", professor);
			consulta.setDate("data_emprestimo", data_emprestimo);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}

	public Long buscarIdEmprestimoAluno(String tombo, Long genero,Long turma, 
			Long aluno, String dataEmprestimo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Emprestimo.buscarIdAluno");
			consulta.setString("livro_tombo", tombo);
			consulta.setLong("genero_id", genero);
			consulta.setLong("turma_id", turma);
			consulta.setLong("aluno_id", aluno);
			consulta.setString("dataEmprestimo", dataEmprestimo);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}
	public Long buscarIdEmprestimoProfessor(String tombo, Long genero, Long professor,
			String dataEmprestimo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
			Query consulta = session.getNamedQuery("Emprestimo.buscarIdProfessor");
			consulta.setString("livro_tombo", tombo);
			consulta.setLong("genero_id", genero);
			consulta.setLong("professor_id", professor);
			consulta.setString("dataEmprestimo", dataEmprestimo);
			id = (Long) consulta.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}

	// Fim dos métodos de buscar o Id

}
