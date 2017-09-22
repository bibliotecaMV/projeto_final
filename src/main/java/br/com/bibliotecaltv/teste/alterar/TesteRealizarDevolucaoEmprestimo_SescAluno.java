package br.com.bibliotecaltv.teste.alterar;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.dao.Emprestimo_SescDAO;

public class TesteRealizarDevolucaoEmprestimo_SescAluno {

	public static void main(String[] args) throws Exception {
		Emprestimo_SescDAO dao = new Emprestimo_SescDAO();

		Emprestimo_Sesc emprestimo_Sesc = dao.listarPorId(Emprestimo_Sesc.class, 2L);
		if(emprestimo_Sesc.getData_devolucao() == null ) {
			emprestimo_Sesc.setData_devolucao(Calendar.getInstance().getTime());
			dao.alterar(emprestimo_Sesc);
		}else{
			System.out.println("Devolução já realizada");
		}
	}

}
