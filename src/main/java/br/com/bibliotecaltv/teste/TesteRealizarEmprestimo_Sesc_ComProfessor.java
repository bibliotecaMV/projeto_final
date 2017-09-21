package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimo_Sesc_ComProfessor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
<<<<<<< HEAD
		Long id_professor = dao.buscarIdProfessor("Kelmy Camurça","3455689");
=======
		Long id_professor = dao.buscarIdProfessor("Edy Vidal", 3455545L);
>>>>>>> 9201d0c3b7a0ae86afa59c6fa64db3d1eac89277
		Professor professor = dao.buscarProfessorPorId(id_professor);
		
		Emprestimo_Sesc emprestimo_Sesc = new Emprestimo_Sesc();
		emprestimo_Sesc.setProfessor(professor);
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setAutor("Gilmar");
		emprestimo_Sesc.setCDD("002");
		emprestimo_Sesc.setTitulo("Teste com realizar emprestimo_professor");
		emprestimo_Sesc.setTombo("345");
		try {
			dao.realizarEmprestimo_Sesc(emprestimo_Sesc);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
