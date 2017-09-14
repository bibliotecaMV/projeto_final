package br.com.bibliotecaltv.teste;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarAluno {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Aluno> aluno = dao.listarAluno();
		
		for(Aluno alunos: aluno) {
			System.out.println(alunos);
		}

	}
}
