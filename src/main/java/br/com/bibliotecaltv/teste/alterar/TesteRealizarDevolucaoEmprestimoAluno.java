package br.com.bibliotecaltv.teste.alterar;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.EmprestimoDAO;

public class TesteRealizarDevolucaoEmprestimoAluno {
	public static void main(String[] args) throws Exception {
		EmprestimoDAO dao = new EmprestimoDAO();
		
		Emprestimo emprestimo = dao.listarPorId(Emprestimo.class, 2L);
		if(emprestimo.getDataDevolucao() == null){
			emprestimo.setDataDevolucao(Calendar.getInstance().getTime());
			dao.alterar(emprestimo);
		}else{
			System.out.println("Devolução já realizada");
		}
		
	}
}
