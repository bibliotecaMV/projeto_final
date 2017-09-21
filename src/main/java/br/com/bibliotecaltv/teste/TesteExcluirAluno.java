package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AlunoDAO;

public class TesteExcluirAluno {
	// servidor:porta/alunoService/{id} DELETE http.delete(alunoService,1)
	public static void main(String[] args) {

		AlunoDAO dao = new AlunoDAO();
		//Long id_aluno = dao.buscarIdAluno("Renato Richard",32L,"3455617");
		//Aluno aluno = dao.buscarAlunoPorId(id_aluno);
		dao.excluir(1L);		

	}
}
