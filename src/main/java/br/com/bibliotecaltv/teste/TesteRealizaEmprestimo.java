package br.com.bibliotecaltv.teste;


import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteRealizaEmprestimo {

	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		
		//inserindo livro
		String livro_titulo = "loucura";
		Long id_livro = dao.buscarIdLivro(livro_titulo);
		Livro livro = dao.buscarLivroPorId(id_livro);
		
		//inserindo aluno
		String Aluno_nome = "Renato";
		Long id_aluno = dao.buscarIdAluno(Aluno_nome);
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);
		
		//inserindo turma
		String Turma_turma = "A";
		Long id_turma = dao.buscarIdTurma(Turma_turma);
		Turma turma = dao.buscarTurmaPorId(id_turma);
		
		//inserindo Genero
		String Genero_sigla = "Masc";
		Long id_genero = dao.buscarIdGenero(Genero_sigla);
		Genero genero = dao.buscarGeneroPorId(id_genero);
		
		// inserindo Professor
		String Professor_nome = "Kelmy";
		Long id_professor = dao.buscarIdProfessor(Professor_nome);
		Professor professor = dao.buscarProfessorPorId(id_professor);
		
	    Emprestimo emp = new Emprestimo();
	   
	    emp.setLivro(livro);
	    emp.setDataDevolucao("222222");
	    emp.setDataEmprestimo("222222");
	    emp.setProfessor(professor);
	    emp.setAluno(aluno);
	    emp.setGenero(genero);
	    
	    


	}

}
