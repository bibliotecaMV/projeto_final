package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarAluno {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Aluno aluno = dao.buscarAlunoPorId(4L);
		aluno.setNome("Lucas Mayk");
		aluno.setMatricula("3579243");
		aluno.setNumero(25L);
		dao.alterarAluno(aluno);
	}

}
