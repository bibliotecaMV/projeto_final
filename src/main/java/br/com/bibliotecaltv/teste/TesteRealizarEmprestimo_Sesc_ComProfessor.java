package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimo_Sesc_ComProfessor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		
		String tombo_livro = dao.buscarTomboLivro("The Love");
		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		
		Long id_professor = dao.buscarIdProfessor("Kelmy Camurça");
		Professor professor = dao.buscarProfessorPorId(id_professor);
		
		Emprestimo_Sesc emprestimo_Sesc = new Emprestimo_Sesc();
		emprestimo_Sesc.setProfessor(professor);
		emprestimo_Sesc.setAutor(livro.getAutor());
		emprestimo_Sesc.setCDD(livro.getCDD());
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setTitulo(livro.getTitulo());
		emprestimo_Sesc.setLivro(livro);
		
		dao.realizarEmprestimo_Sesc(emprestimo_Sesc);
	}
}
