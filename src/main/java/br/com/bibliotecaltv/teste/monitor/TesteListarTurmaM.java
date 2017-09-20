package br.com.bibliotecaltv.teste.monitor;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteListarTurmaM {

	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		List<Turma> turma = dao.listarTurma();
		
		for(Turma turmas: turma) {
			System.out.println(turmas);
		}

	}

}
