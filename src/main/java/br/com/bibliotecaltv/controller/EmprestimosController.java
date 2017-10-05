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
		return "redirect:listarTodosEmprestimos";
	}
	public void setarValoresFormulario(Model model){
		model.addAttribute("livros", daoLivro.listar(Livro.class));
		model.addAttribute("turmas", daoTurma.listar(Turma.class));
		model.addAttribute("professores", daoProfessor.listar(Professor.class));
	}
	@RequestMapping("listarTodosEmprestimos")
	public String listarTodosEmprestimos(Model model){
		model.addAttribute("emprestimos", daoEmprestimo.listar(Emprestimo.class));
		setarValoresFormulario(model);
		return "emprestimos/emprestimos";
	}
	@RequestMapping("listarEmprestimosDaTable")
	public String listarEmprestimosDaTable(String option, String turma2,
			String aluno2, String professor2, String selection, Model model){
		if(option.equals("todos")){
			if(selection != null){
				model.addAttribute("resultado", 1L);
				model.addAttribute("emprestimos", daoEmprestimo.listar(Emprestimo.class));
			}else{
				model.addAttribute("resultado", 2L);
				model.addAttribute("emprestimos", 
						daoEmprestimo.listarNotNullEntidade("Emprestimo","Emprestimo"));
			}
		}else if(option.equals("alunos")){
			if(selection != null){
				model.addAttribute("resultado", 3L);
				model.addAttribute("emprestimos", 
						daoEmprestimo.listarNotNullEntidade("Emprestimo", "AlunoDevolvidos"));
			}else{
				model.addAttribute("resultado", 4L);
				model.addAttribute("emprestimos", 
						daoEmprestimo.listarNotNullEntidade("Emprestimo", "AlunoNaoDevolvidos"));
			}
		}else if(option.equals("professores")){
			if(selection != null){
				model.addAttribute("resultado", 5L);
				model.addAttribute("emprestimos", 
						daoEmprestimo.listarNotNullEntidade("Emprestimo", "ProfessorDevolvidos"));
			}else{
				model.addAttribute("resultado", 6L);
				model.addAttribute("emprestimos", 
						daoEmprestimo.listarNotNullEntidade("Emprestimo", "ProfessorNaoDevolvidos"));
			}
		}else{
			System.out.println("erro");
		}
		return "emprestimos/emprestimos";
	}
	@RequestMapping("realizarEmprestimos")
	public String realizarEmprestimos(String tombo, String aluno, 
			String professor, String turma) throws Exception{
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmprestimoFormatada(Calendar.getInstance().getTime().toString());
		Livro livro = daoLivro.listarPorId(Livro.class, tombo);
		emprestimo.setLivro(livro);
		if(aluno != null){
			Long turma_id = daoTurma.listarIdPorNome("Turma", turma);
			Long aluno_id = daoAluno.listarIdPorNomeTurma("Aluno", aluno, turma_id);
			Aluno aluno1 = daoAluno.listarPorId(Aluno.class, aluno_id);
			emprestimo.setAluno(aluno1);
			emprestimo.setTurma(aluno1.getTurma());
			
		}else if(professor != null){
			Long professor_id = daoProfessor.listarIdPorNome("Professor", professor);
			Professor professor1 = daoProfessor.listarPorId(Professor.class, professor_id);
			emprestimo.setProfessor(professor1);
		}else{
			return "redirect:listarTodosEmprestimos";
		}
		daoEmprestimo.salvar(emprestimo);
		return "redirect:listarTodosEmprestimos";
	}
	@RequestMapping("realizarDevolucao")
	public void realizarDevolucao(Long id, HttpServletResponse response) throws Exception{
		Emprestimo emprestimo = daoEmprestimo.listarPorId(Emprestimo.class, id);
		emprestimo.setDataDevolucaoFormatada(Calendar.getInstance().getTime().toString());
		try{
			daoEmprestimo.alterar(emprestimo);
		}catch(Exception e){
			e.printStackTrace();
		}
		response.setStatus(200);
		response.getWriter().write(emprestimo.getDataDevolucaoFormatada().toString());
	}
	@RequestMapping("excluirEmprestimo")
	public void excluirEmprestimo(Long id, HttpServletResponse response) throws Exception{
		Emprestimo emprestimo = daoEmprestimo.listarPorId(Emprestimo.class, id);
		daoEmprestimo.excluir(emprestimo);
		response.setStatus(200);
	}
}
