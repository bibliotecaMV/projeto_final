package br.com.bibliotecaltv.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdSesc {

	public static void main(String[] args) {

		AdministradorDAO dao = new AdministradorDAO();
		Livro livro = dao.buscarLivroPorTombo("333");
		String tombo = livro.getTombo();
		Genero genero = livro.getGenero();
		Long id_genero = genero.getId();
		Aluno aluno = dao.buscarAlunoPorId(1L);
		Long id_aluno = aluno.getId();
		Turma turma = aluno.getTurma();
		Long id_turma = turma.getId();
		
		SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date data = null;
		try{
			data = formate.parse("2017-09-21 14:17:31");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		String dataEmprestimo = formate.format(data);
		
		Long id_emprestimo = dao.buscarIdEmprestimo_SescAluno(tombo, id_genero, id_turma,
			id_aluno, dataEmprestimo);
		System.out.println(id_emprestimo);
		
		
	}

}

/*public Long buscarIdEmprestimoAluno(String tombo, Long genero,Long turma, 
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
}*/