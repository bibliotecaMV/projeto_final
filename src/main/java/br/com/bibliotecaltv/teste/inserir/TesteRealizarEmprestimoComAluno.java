package br.com.bibliotecaltv.teste.inserir;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.EmprestimoDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteRealizarEmprestimoComAluno {
	public static void main(String[] args) throws Exception {

		EmprestimoDAO daoEmprestimo = new EmprestimoDAO();
		AlunoDAO daoAluno = new AlunoDAO();
		LivroDAO daoLivro = new LivroDAO();
		
		Emprestimo emprestimo = new Emprestimo();
		Aluno aluno = daoAluno.listarPorId(Aluno.class, 1L);
		Livro livro = daoLivro.listarPorId(Livro.class,"20170930");

		emprestimo.setAluno(aluno);
		emprestimo.setDataEmprestimo(Calendar.getInstance());
		emprestimo.setLivro(livro);
		emprestimo.setTurma(aluno.getTurma());
		
		daoEmprestimo.salvar(emprestimo);

	}
}
