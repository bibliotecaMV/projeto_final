package br.com.bibliotecaltv.teste;

import java.util.Calendar;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarEmprestimoComProfessor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();

		Long id_professor = dao.buscarIdProfessor("Edy Vidal","3455545");
		Professor professor = dao.buscarProfessorPorId(id_professor);

		String titulo = "The Bad";
		String autor = "Pedro Lucas Oliveira de Matos";
		Long genero = dao.buscarIdGenero("Romance");
		String editora = "Eryka";
		Long ano_editado = 2017L;
		Long volume = 1L;
		String forma_aquisicao = "comprado";
		Long exemplares = 30L;
		String tombo_livro = dao.buscarTomboLivro(titulo, autor, genero,
				editora, ano_editado, volume, forma_aquisicao, exemplares);

		Livro livro = dao.buscarLivroPorTombo(tombo_livro);
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setProfessor(professor);
		emprestimo.setGenero(livro.getGenero());
		emprestimo.setLivro(livro);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		dao.realizarEmprestimo(emprestimo);
	}
}
