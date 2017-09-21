package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarAlunoPorIdM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Aluno aluno = dao.buscarAlunoPorId(1L);
		System.out.println(aluno.getNome());
	}
}
