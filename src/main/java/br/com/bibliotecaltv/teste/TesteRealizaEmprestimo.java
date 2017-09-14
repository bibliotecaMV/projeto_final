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
		String livro_titulo = "loucura";
		Long id_livro = dao.buscarIdLivro(livro_titulo);
		Livro livro = dao.buscarLivroPorId(id_livro);
		
	    Emprestimo emp = new Emprestimo();
	    
	    emp.setLivro(livro);
	    
	    /*Aluno aluno = new Aluno();
	   */ Genero genero = new Genero();
	    Turma turma = new Turma();
	    Professor professor = new Professor();
*/

	}

}
