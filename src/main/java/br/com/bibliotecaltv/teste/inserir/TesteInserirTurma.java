package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.TurmaDAO;

public class TesteInserirTurma {

	public static void main(String[] args) {
		TurmaDAO dao = new TurmaDAO();
		Turma turma = new Turma();
		turma.setNome("3A");
		dao.salvar(turma);
	}

}
