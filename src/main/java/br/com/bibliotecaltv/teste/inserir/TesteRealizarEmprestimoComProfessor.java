package br.com.bibliotecaltv.teste.inserir;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.EmprestimoDAO;
import br.com.bibliotecaltv.dao.LivroDAO;
import br.com.bibliotecaltv.dao.ProfessorDAO;

public class TesteRealizarEmprestimoComProfessor {
	public static void main(String[] args) throws Exception {
		EmprestimoDAO daoEmprestimo = new EmprestimoDAO();
		ProfessorDAO daoProfessor = new ProfessorDAO();
		LivroDAO daoLivro = new LivroDAO();
		
		Professor professor = daoProfessor.listarPorId(Professor.class,1L);
		
		Livro livro = daoLivro.listarPorId(Livro.class, "333");
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setProfessor(professor);
		emprestimo.setGenero(livro.getGenero());
		emprestimo.setLivro(livro);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		daoEmprestimo.salvar(emprestimo);
	}
}
