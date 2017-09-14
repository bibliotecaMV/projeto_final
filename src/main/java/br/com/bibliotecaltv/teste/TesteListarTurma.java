package br.com.bibliotecaltv.teste;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarTurma {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Turma> turma = dao.listarTurma();
		
		for(Turma turmas: turma) {
			System.out.println(turmas);
		}

	}

}
