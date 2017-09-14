package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimoAdm {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Livro livro = new Livro();
		Aluno aluno = new Aluno();
		Turma turma = new Turma();
		Professor professor = new Professor();
		
		aluno.setMatricula(3455545L);
		aluno.setNome("Pedro Lucas");
		aluno.setNumero(29L);
	}
}
