package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarAluno {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Aluno aluno = new Aluno();
		aluno.setId(1L);
		aluno.setNome("mayk lucas");
		aluno.setMatricula(233L);
		aluno.setNumero(25L);
		dao.alterarAluno(aluno);
	}

}
