package br.com.bibliotecaltv.teste.inserir;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.EmprestimoDAO;
import br.com.bibliotecaltv.dao.GeneroDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteRealizarEmprestimoComAluno {
	public static void main(String[] args) throws Exception {

		EmprestimoDAO daoEmprestimo = new EmprestimoDAO();
		AlunoDAO daoAluno = new AlunoDAO();
		GeneroDAO daoGenero = new GeneroDAO();
		LivroDAO daoLivro = new LivroDAO();
		
		Emprestimo emprestimo = new Emprestimo();
		Aluno aluno = daoAluno.listarPorId(Aluno.class, 1L);
		Genero genero = daoGenero.listarPorId(Genero.class, 1L);
		Livro livro = daoLivro.listarPorId(Livro.class,"20170930");

		emprestimo.setAluno(aluno);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		emprestimo.setLivro(livro);
		emprestimo.setGenero(genero);
		emprestimo.setTurma(aluno.getTurma());
		
		daoEmprestimo.salvar(emprestimo);

	}
}
