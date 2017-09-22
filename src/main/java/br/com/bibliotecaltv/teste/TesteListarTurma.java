package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.TurmaDAO;

public class TesteListarTurma {

	public static void main(String[] args) {
		TurmaDAO dao = new TurmaDAO();
		List<Turma> turma = dao.listar(Turma.class);
		
		for(Turma turmas: turma) {
			System.out.println(turmas);
		}

	}

}
