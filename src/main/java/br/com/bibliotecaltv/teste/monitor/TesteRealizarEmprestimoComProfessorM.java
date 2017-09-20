package br.com.bibliotecaltv.teste.monitor;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteRealizarEmprestimoComProfessorM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();

		Long id_professor = dao.buscarIdProfessor("Kelmy Camurça");
		Professor professor = dao.buscarProfessorPorId(id_professor);

		String titulo = "The Love";
		String autor = "Kelmy";
		Long genero = dao.buscarIdGenero("Romance");
		String editora = "Eryka";
		Long ano_editado = 2000L;
		Long volume = 3L;
		String forma_aquisicao = "comprado";
		Long exemplares = 10L;
		String tombo_livro = dao.buscarTomboLivro(titulo, autor, genero, editora, ano_editado, volume, forma_aquisicao,
				exemplares);

		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setProfessor(professor);
		emprestimo.setGenero(livro.getGenero());
		emprestimo.setLivro(livro);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		dao.realizaEmprestimo(emprestimo);
	}
}
