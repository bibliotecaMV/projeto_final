package br.com.bibliotecaltv.teste.listarPorId;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AlunoDAO;

public class TesteBuscarAlunoPorId {
	public static void main(String[] args) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = dao.listarPorId(Aluno.class, 1L);
		System.out.println(aluno.getNome());
	}
}
