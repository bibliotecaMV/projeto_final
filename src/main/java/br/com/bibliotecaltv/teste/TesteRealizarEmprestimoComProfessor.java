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
		
		Long tombo_livro = dao.buscarTomboLivro("The Love");
		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setProfessor(professor);
		emprestimo.setGenero(livro.getGenero());
		emprestimo.setLivro(livro);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		dao.realizarEmprestimo(emprestimo);
	}
}
