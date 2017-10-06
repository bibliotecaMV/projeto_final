package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.TurmaDAO;

public class TesteInserirTurma {

	public static void main(String[] args) {
		TurmaDAO dao = new TurmaDAO();
		Turma turma3 = new Turma();
		turma3.setNome("3C");
		dao.salvar(turma3);
	}

}
