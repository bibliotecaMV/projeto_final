package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarAlunoPorId {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Aluno aluno = dao.buscarAlunoPorId(1L);
		System.out.println(aluno.getNome());
	}
}
