package br.com.bibliotecaltv.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdEmprestimoProfessor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Livro livro = dao.buscarLivroPorTombo("3455545");
		String tombo = livro.getTombo();
		Genero genero = livro.getGenero();
		Long id_genero = genero.getId();
		Professor professor = dao.buscarProfessorPorId(1L);
		Long id_professor = professor.getId();
		
		SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date data = null;
		try{
			data = formate.parse("2017-09-20 17:54:41");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		String dataEmprestimo = formate.format(data);
		Long id_emprestimo = dao.buscarIdEmprestimoProfessor(tombo, id_genero, id_professor,
			dataEmprestimo);
		System.out.println(id_emprestimo);
		
	}
}
