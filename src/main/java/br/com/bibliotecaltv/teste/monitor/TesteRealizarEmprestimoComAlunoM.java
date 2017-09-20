package br.com.bibliotecaltv.teste.monitor;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;

import br.com.bibliotecaltv.controller.javabeans.Livro;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteRealizarEmprestimoComAlunoM {
	public static void main(String[] args) {

		MonitoresDAO dao = new MonitoresDAO();
		Emprestimo emprestimo = new Emprestimo();

		Long id_aluno = dao.buscarIdAluno("Renato Richard");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);

		String titulo = "The Love";
		String autor = "Kelmy";
		Long id_genero = dao.buscarIdGenero("Romance");
		String editora = "Eryka";
		Long ano_editado = 2000L;
		Long volume = 3L;
		String forma_aquisicao = "comprado";
		Long exemplares = 10L;
		String tombo_livro = dao.buscarTomboLivro(titulo, autor, id_genero, editora, ano_editado, volume,
				forma_aquisicao, exemplares);
		System.out.println(tombo_livro);
		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		emprestimo.setAluno(aluno);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		emprestimo.setLivro(livro);
		emprestimo.setGenero(dao.buscarGeneroPorId(id_genero));
		emprestimo.setTurma(aluno.getTurma());
		dao.realizaEmprestimo(emprestimo);

	}
}