package br.com.bibliotecaltv.teste.listarPorId;


import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.dao.Emprestimo_SescDAO;

public class TesteBuscarEmprestimo_SescPorId {

	public static void main(String[] args) throws Exception {
		Emprestimo_SescDAO dao = new Emprestimo_SescDAO();
		Emprestimo_Sesc emprestimo_Sesc = dao.listarPorId(Emprestimo_Sesc.class, 1L);
		System.out.println(emprestimo_Sesc);
	}

}
