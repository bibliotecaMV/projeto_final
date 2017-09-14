package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarEmprestimo_Sesc {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Emprestimo_Sesc> emprestimo_sesc = dao.listarEmprestimo_Sesc();
		
		for(Emprestimo_Sesc emprestimo_sescs: emprestimo_sesc) {
			System.out.println(emprestimo_sescs);
		}

	}

}
