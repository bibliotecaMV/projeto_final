package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimoComAluno {
	public static void main(String[] args) {

		AdministradorDAO dao = new AdministradorDAO();
		Emprestimo emprestimo = new Emprestimo();

		Long id_aluno = dao.buscarIdAluno("Pedro Lucas",25L,"3455545");
		Aluno aluno = dao.buscarAlunoPorId(id_aluno);

		String titulo = "The Bad";
		String autor = "Pedro Lucas Oliveira de Matos";
		Long id_genero = dao.buscarIdGenero("Romance");
		String editora = "Eryka";
		Long ano_editado = 2017L;
		Long volume = 1L;
		String forma_aquisicao = "comprado";
		Long exemplares = 30L;
		String tombo_livro = dao.buscarTomboLivro(titulo, autor, id_genero,
				editora, ano_editado, volume, forma_aquisicao, exemplares);
		System.out.println(tombo_livro);

		Livro livro = dao.buscarLivroPorTombo(tombo_livro);

		emprestimo.setAluno(aluno);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		emprestimo.setLivro(livro);
		emprestimo.setGenero(dao.buscarGeneroPorId(id_genero));
		emprestimo.setTurma(aluno.getTurma());
		
		dao.realizarEmprestimo(emprestimo);

	}
}
