package br.com.bibliotecaltv.teste.listar;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.dao.Emprestimo_SescDAO;

public class TesteListarEmprestimo_Sesc {

	public static void main(String[] args) throws Exception {
		Emprestimo_SescDAO dao = new Emprestimo_SescDAO();
		List<Emprestimo_Sesc> emprestimo_sesc = dao.listar(Emprestimo_Sesc.class);
		
		for(Emprestimo_Sesc emprestimo_sescs: emprestimo_sesc) {
			System.out.println(emprestimo_sescs);
		}

	}

}
