package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteInserirMonitor {
	public static void main(String[] args) throws Exception {
		MonitoresDAO daoMonitores = new MonitoresDAO();
		AlunoDAO daoAluno = new AlunoDAO();
		Aluno aluno = daoAluno.listarPorId(Aluno.class, 1L);
		Monitores monitores = new Monitores();
		monitores.setAluno(aluno);
		monitores.setUsuario("mayk");
		monitores.setSenha("1234");
		daoMonitores.salvar(monitores);
	}
}
