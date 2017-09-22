package br.com.bibliotecaltv.teste.alterar;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.dao.Emprestimo_SescDAO;

public class TesteRealizarDevolucaoEmprestimo_SescProfessor {
	public static void main(String[] args) throws Exception {
		Emprestimo_SescDAO daoEmprestimo_Sesc = new Emprestimo_SescDAO();
		Emprestimo_Sesc emprestimo_Sesc = daoEmprestimo_Sesc.listarPorId(Emprestimo_Sesc.class, 2L);
		emprestimo_Sesc.setData_devolucao(Calendar.getInstance().getTime());
		daoEmprestimo_Sesc.alterar(emprestimo_Sesc);
	}
}
