package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TestePegarIdTurmaM {
	public static void main(String[] args) {
	MonitoresDAO dao = new MonitoresDAO();
    System.out.println(dao.buscarIdTurma("3A"));
	}
}
