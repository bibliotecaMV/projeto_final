package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarIdAluno {
      public static void main(String []args) {
    	  MonitoresDAO m = new MonitoresDAO();
    	  System.out.println(m.buscarIdAluno("Renato"));
      }
}
