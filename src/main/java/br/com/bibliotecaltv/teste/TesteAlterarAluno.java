package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarAluno {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Aluno aluno = dao.buscarAlunoPorId(1L);
		aluno.setNome("Pedro Lucas");
		aluno.setMatricula("233");
		aluno.setNumero(29L);
		dao.alterarAluno(aluno);
	}

}
