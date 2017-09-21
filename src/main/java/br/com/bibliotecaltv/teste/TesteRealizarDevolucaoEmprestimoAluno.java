package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarDevolucaoEmprestimoAluno {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Emprestimo emprestimo = dao.buscarEmprestimoPorId(6L);
		if(emprestimo.getDataDevolucao() == null){
			emprestimo.setDataDevolucao(Calendar.getInstance().getTime());
			dao.realisarDevolucaoEmprestimo(emprestimo);
		}else{
			System.out.println("Devolução já realizada");
		}
		
	}
}
