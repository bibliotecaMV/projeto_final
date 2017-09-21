package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AlunoDAO;

public class TesteInserirAluno {
	public static void main(String[] args) {
		//AdministradorDAO daoEstranho = new AdministradorDAO();
		AlunoDAO dao = new AlunoDAO();
		//Long id_turma= daoEstranho.buscarIdTurma("3A");
		//Turma turma = daoEstranho.buscarTurmaPorId(id_turma);
		Aluno aluno = new Aluno();
		aluno.setMatricula("3429753");
		aluno.setNome("Mayk Lucas");
		aluno.setNumero(25L);
		Turma teste = new Turma();
		teste.setId(1L);
		aluno.setTurma(teste);
		dao.salvar(aluno);
		//dao.adicionarAluno(aluno);

	}
}
