package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AlunoDAO;

public class TesteListarAluno {
	public static void main(String[] args) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> aluno = dao.listar(Aluno.class);
		
		for(Aluno alunos: aluno) {
			System.out.println(alunos);
		}

	}
}
