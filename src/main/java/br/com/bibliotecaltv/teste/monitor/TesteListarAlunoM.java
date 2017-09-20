package br.com.bibliotecaltv.teste.monitor;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteListarAlunoM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		List<Aluno> aluno = dao.listarAluno();
		
		for(Aluno alunos: aluno) {
			System.out.println(alunos);
		}

	}
}
