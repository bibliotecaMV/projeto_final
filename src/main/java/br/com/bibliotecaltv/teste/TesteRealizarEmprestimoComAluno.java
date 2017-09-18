package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimoComAluno {
	public static void main(String[] args) {
		
		AdministradorDAO dao = new AdministradorDAO();
		Emprestimo emprestimo = new Emprestimo();
		
		Long id_aluno = dao.buscarIdAluno("Renato Richard");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);
		String tombo_livro = dao.buscarTomboLivro("The Love");
		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		
		emprestimo.setAluno(aluno);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		emprestimo.setLivro(livro);
		emprestimo.setGenero(livro.getGenero());
		emprestimo.setTurma(aluno.getTurma());
		dao.realizarEmprestimo(emprestimo);
	}
}
