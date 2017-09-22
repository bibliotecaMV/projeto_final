package br.com.bibliotecaltv.teste.inserir;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.Emprestimo_SescDAO;
import br.com.bibliotecaltv.dao.ProfessorDAO;

public class TesteRealizarEmprestimo_Sesc_ComProfessor {
	public static void main(String[] args) throws Exception {
		Emprestimo_SescDAO daoEmprestimo_Sesc = new Emprestimo_SescDAO();
		ProfessorDAO daoProfessor = new ProfessorDAO();
		
		Professor professor = daoProfessor.listarPorId(Professor.class, 1L);
		
		Emprestimo_Sesc emprestimo_Sesc = new Emprestimo_Sesc();
		emprestimo_Sesc.setProfessor(professor);
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setAutor("Gilmar");
		emprestimo_Sesc.setCDD("002");
		emprestimo_Sesc.setTitulo("Teste com realizar emprestimo_professor");
		emprestimo_Sesc.setTombo("345");
		daoEmprestimo_Sesc.salvar(emprestimo_Sesc);
	}
}
