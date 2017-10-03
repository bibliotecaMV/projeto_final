package br.com.bibliotecaltv.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.EmprestimoDAO;
import br.com.bibliotecaltv.dao.LivroDAO;
import br.com.bibliotecaltv.dao.ProfessorDAO;
import br.com.bibliotecaltv.dao.TurmaDAO;

@Controller
public class EmprestimosController {
	
	EmprestimoDAO daoEmprestimo;
	LivroDAO daoLivro;
	TurmaDAO daoTurma;
	AlunoDAO daoAluno;
	ProfessorDAO daoProfessor;
	@Autowired
	public EmprestimosController(EmprestimoDAO daoEmprestimo, LivroDAO daoLivro,
			TurmaDAO daoTurma, AlunoDAO daoAluno, ProfessorDAO daoProfessor){
		this.daoEmprestimo = daoEmprestimo;
		this.daoLivro = daoLivro;
		this.daoTurma = daoTurma;
		this.daoAluno = daoAluno;
		this.daoProfessor = daoProfessor;
	}
	@RequestMapping("mostrarEmprestimos")
	public String mostrarEmprestimos(){
		return "redirect:listarDadosParaEmprestimos";
	}
	@RequestMapping("listarDadosParaEmprestimos")
	public String listarDadosParaEmprestimos(Model model){
		model.addAttribute("emprestimos", daoEmprestimo.listar(Emprestimo.class));
		model.addAttribute("turmas", daoTurma.listar(Turma.class));
		model.addAttribute("professores", daoProfessor.listar(Professor.class));
		model.addAttribute("alunos", daoAluno.listar(Aluno.class));
		return "emprestimos/emprestimos";
	}
	@RequestMapping("realizarEmprestimos")
	public String realizarEmprestimos(String tombo, String nome_aluno, 
			String nome_professor) throws Exception{
		Emprestimo emprestimo = new Emprestimo();
		Livro livro = daoLivro.listarPorId(Livro.class, tombo);
		emprestimo.setLivro(livro);
		emprestimo.setDataEmprestimo(Calendar.getInstance().getTime());
		emprestimo.setGenero(livro.getGenero());
		if(nome_aluno != null){
			Long id_aluno = daoAluno.listarIdPorNome("Aluno", nome_aluno);
			Aluno aluno = daoAluno.listarPorId(Aluno.class, id_aluno);
			emprestimo.setAluno(aluno);
			emprestimo.setTurma(aluno.getTurma());
		}else if(nome_professor != null){
			Long id_professor = daoProfessor.listarIdPorNome
					("Professor", nome_professor);
			Professor professor = daoProfessor.listarPorId
					(Professor.class, id_professor);
			emprestimo.setProfessor(professor);
		}
		daoEmprestimo.salvar(emprestimo);
		return "redirect:listarDadosParaEmprestimos";
	}
	@RequestMapping("realizarDevolucao")
	public void realizarDevolucao(Long id, HttpServletResponse response) throws Exception{
		Emprestimo emprestimo = daoEmprestimo.listarPorId(Emprestimo.class, id);
		emprestimo.setDataDevolucao(Calendar.getInstance().getTime());
		try{
			daoEmprestimo.alterar(emprestimo);
		}catch(Exception e){
			e.printStackTrace();
		}
		response.setStatus(200);
		response.getWriter().write(emprestimo.getDataDevolucao().toString());
	}
}
