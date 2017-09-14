package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TestePegarIdTurma {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		String nome = "3A";
		Long id_turma = dao.buscarIdTurma(nome);
		System.out.println(id_turma);
	}
}
