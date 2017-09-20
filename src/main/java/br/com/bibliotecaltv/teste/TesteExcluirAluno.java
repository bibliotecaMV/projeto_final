package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirAluno {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id_aluno = dao.buscarIdAluno("Renato Richard",32L,"3455617");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);
		dao.excluirAluno(aluno);
		System.out.println("Exclui você otário!!!");
		
	}
}
