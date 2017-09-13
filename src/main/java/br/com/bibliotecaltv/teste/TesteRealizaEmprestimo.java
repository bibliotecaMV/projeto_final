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
	    Emprestimo emp = new Emprestimo();
	    Aluno aluno = new Aluno();
	    Genero genero = new Genero();
	    Turma turma = new Turma();
	    Livro livro = new Livro();
	    Professor professor = new Professor();
	 
	    emp.setAluno(aluno);
	    emp.setDataEmprestimo("10/10/2012");
	    emp.setGenero(genero);
	    emp.setTurma(turma);
	    emp.setLivro(livro);
	    emp.setProfessor(professor);
	    emp.setTombo(null);
	    emp.setTurma(turma);
	    emp.setDataDevolucao(null);
       
	    MonitoresDAO dao = new MonitoresDAO();
	    dao.realizaEmprestimo(emp);

	}

}
