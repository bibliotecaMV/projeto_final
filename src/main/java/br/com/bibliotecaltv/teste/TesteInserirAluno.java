package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirAluno {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id_turma= dao.buscarIdTurma("3A");
		Turma turma = dao.buscarTurmaPorId(id_turma);
		Aluno aluno = new Aluno();
		aluno.setMatricula("3453234");
		aluno.setNome("Carla Val�ria");
		aluno.setNumero(4L);
		aluno.setTurma(turma);
		dao.adicionarAluno(aluno);
	}
}
