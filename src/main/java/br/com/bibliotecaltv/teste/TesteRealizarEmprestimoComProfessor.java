package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimoComProfessor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		
		Long id_professor = dao.buscarIdProfessor("Kelmy Camurça");
		Professor professor = dao.buscarProfessorPorId(id_professor);
		
<<<<<<< HEAD
		Long tombo_livro = dao.buscarTomboLivro("The Love");
=======
		String tombo_livro = dao.buscarTomboLivro("The Love");
>>>>>>> c7db692987863bcd5a65ca525e779bd19f8dcb25
		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setProfessor(professor);
		emprestimo.setGenero(livro.getGenero());
		emprestimo.setLivro(livro);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		dao.realizarEmprestimo(emprestimo);
	}
}
