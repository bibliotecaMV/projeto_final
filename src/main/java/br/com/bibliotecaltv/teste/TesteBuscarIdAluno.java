package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdAluno {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Aluno aluno = new Aluno();
		Long id = dao.buscarAluno("Carla");
		System.out.println(id);
	}

}
