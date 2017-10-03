package br.com.bibliotecaltv.controller.listarPorFK;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AlunoDAO;

public class TesteListarPorChaveEstrangeira {
	public static void main(String[] args) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> alunos = dao.listarPorFK("Aluno", 1L, "turma_id");
		for(Aluno aluno : alunos){
			System.out.println(aluno);
		}
	}
}
