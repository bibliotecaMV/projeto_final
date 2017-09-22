package br.com.bibliotecaltv.teste.excluir;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AlunoDAO;


public class TesteExcluirAluno {
	public static void main(String[] args) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = dao.listarPorId(Aluno.class, 1L);
		dao.excluir(aluno);
	}
}
