package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirMonitor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		
		Long id_aluno = dao.buscarIdAluno("Renato Richard",32L,"3455617");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);
		
		Monitores monitores = new Monitores();
		monitores.setAluno(aluno);
		monitores.setLogin("Renatorichard2012@gmail.com");
		monitores.setSenha("1234567");
		dao.adicionarMonitor(monitores);
	}
}
