package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TestePegarIdLivro {
	public static void main(String[] args) {
	MonitoresDAO dao = new MonitoresDAO();
    System.out.println(dao.buscarIdLivro("loucura"));
	}
}
