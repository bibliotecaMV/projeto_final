package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.dao.Emprestimo_SescDAO;

public class TesteRealizarEmprestimo_Sesc_ComAluno {
	public static void main(String[] args) {
		
		
		/*Long id_aluno = dao.buscarIdAluno("Carla Valéria", 4L, "3453234");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);*/
		
		Emprestimo_SescDAO dao = new Emprestimo_SescDAO();
		Aluno aluno = new Aluno();
		aluno.setId(1L);
		Emprestimo_Sesc emprestimo_Sesc = new Emprestimo_Sesc();
		emprestimo_Sesc.setAluno(aluno);
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setAutor("Leandro");
		emprestimo_Sesc.setCDD("001");
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setTitulo("Teste emprestimo_sesc");
		emprestimo_Sesc.setTombo("333");
		emprestimo_Sesc.setTurma(aluno.getTurma());
		
		try {
			dao.salvar(emprestimo_Sesc);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/*AdministradorDAO dao = new AdministradorDAO();
	
		Long id_aluno = dao.buscarIdAluno("Carla Valéria", 4L, "3453234");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);
		
		
		Emprestimo_Sesc emprestimo_Sesc = new Emprestimo_Sesc();
		emprestimo_Sesc.setAluno(aluno);
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setAutor("Leandro");
		emprestimo_Sesc.setCDD("001");
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setTitulo("Teste emprestimo_sesc");
		emprestimo_Sesc.setTombo("333");
		emprestimo_Sesc.setTurma(aluno.getTurma());
		try {
			dao.realizarEmprestimo_Sesc(emprestimo_Sesc);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
	}
}
