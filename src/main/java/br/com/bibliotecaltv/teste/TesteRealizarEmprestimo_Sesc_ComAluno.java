package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo_Sesc;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimo_Sesc_ComAluno {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		

		String tombo_livro = dao.buscarTomboLivro("The Love");
		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		

		Long id_aluno = dao.buscarIdAluno("Renato Richard");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);
		
		Emprestimo_Sesc emprestimo_Sesc = new Emprestimo_Sesc();
		emprestimo_Sesc.setAluno(aluno);

		emprestimo_Sesc.setAutor(livro.getAutor());
		emprestimo_Sesc.setCDD(livro.getCDD());
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setTitulo(livro.getTitulo());
		emprestimo_Sesc.setLivro(livro);

		emprestimo_Sesc.setAutor("Cely");
		emprestimo_Sesc.setCDD("001");
		emprestimo_Sesc.setData_emprestimo(Calendar.getInstance().getTime());
		emprestimo_Sesc.setTitulo("Teste emprestimo_sesc");
		emprestimo_Sesc.setTombo("3455545");

		emprestimo_Sesc.setTurma(aluno.getTurma());
		
		dao.realizarEmprestimo_Sesc(emprestimo_Sesc);
	}
}
