package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.ProfessorDAO;

public class TesteInserirProfessor {
	public static void main(String[] args) {
		ProfessorDAO dao = new ProfessorDAO(); 
		Professor professor = new Professor();
		professor.setMatricula("20001111");
		professor.setNome("Francisco Jos� Nobre de Alburquerque");
		dao.salvar(professor);
	}
}
