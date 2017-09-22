package br.com.bibliotecaltv.teste.inserir;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.Emprestimo_SescDAO;

public class TesteRealizarEmprestimo_Sesc_ComAluno {
	public static void main(String[] args) throws Exception {
		
		Emprestimo_SescDAO daoEmprestimo_Sesc = new Emprestimo_SescDAO();
		AlunoDAO daoAluno = new AlunoDAO();
		
		Aluno aluno = daoAluno.listarPorId(Aluno.class, 1L);
		
		Emprestimo_Sesc emprestimo_Sesc = new Emprestimo_Sesc();
		emprestimo_Sesc.setAluno(aluno);
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setAutor("Leandro");
		emprestimo_Sesc.setCDD("001");
		emprestimo_Sesc.setTitulo("Teste emprestimo_sesc");
		emprestimo_Sesc.setTombo("3334");
		emprestimo_Sesc.setTurma(aluno.getTurma());
		daoEmprestimo_Sesc.salvar(emprestimo_Sesc);
		
	}
}
