package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.TurmaDAO;

public class TesteInserirAluno {
	public static void main(String[] args) throws Exception {
		AlunoDAO daoAluno = new AlunoDAO();
		TurmaDAO daoTurma = new TurmaDAO();
		Turma turma = daoTurma.listarPorId(Turma.class, 3L);
		Aluno aluno = new Aluno();
		aluno.setMatricula("3476842");
		aluno.setNome("Carla Valéria De Paulo");
		aluno.setNumero(04L);
		aluno.setTurma(turma);
		daoAluno.salvar(aluno);

	}
}
