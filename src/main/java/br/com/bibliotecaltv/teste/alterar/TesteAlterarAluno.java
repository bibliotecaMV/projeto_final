package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AlunoDAO;

public class TesteAlterarAluno {

	public static void main(String[] args) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = dao.listarPorId(Aluno.class, 1L);
		aluno.setNome("Paulo");
		aluno.setMatricula("3579243");
		aluno.setNumero(27L);
		dao.alterar(aluno);
	}

}
