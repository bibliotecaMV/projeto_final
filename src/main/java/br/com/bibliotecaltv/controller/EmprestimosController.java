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
		model.addAttribute("resultado", 1L);
		model.addAttribute("emprestimos", daoEmprestimo.listar(Emprestimo.class));
		setarValoresFormulario(model);
		return "emprestimos/emprestimos";
	}
	@RequestMapping("listarEmprestimosDaTable")
	public String listarEmprestimosDaTable(String option, String turma2,
			String aluno2, String professor2, String selection, Model model){
		setarValoresFormulario(model);
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
				if(((turma2.equals("Turma:"))) && (aluno2.equals(""))){
					model.addAttribute("resultado", 3L);
					model.addAttribute("emprestimos", 
							daoEmprestimo.listarNotNullEntidade("Emprestimo", "AlunoDevolvidos2"));
				}else{
					Long turma_id = daoTurma.listarIdPorNome("Turma", turma2);
					Long aluno_id = daoAluno.listarIdPorNomeTurma("Aluno", aluno2, turma_id);
					model.addAttribute("resultado", 3L);
					model.addAttribute("emprestimos", 
							daoEmprestimo.listarNotNullEntidade("Emprestimo", "AlunoDevolvidos1", aluno_id, "aluno_id", turma_id,"turma_id"));
				}
				
			}else{
				if(((turma2.equals("Turma:"))) && (aluno2.equals(""))){
					model.addAttribute("resultado", 4L);
					model.addAttribute("emprestimos", 
							daoEmprestimo.listarNotNullEntidade("Emprestimo", "AlunoNaoDevolvidos2"));
				}else{
					Long turma_id = daoTurma.listarIdPorNome("Turma", turma2);
					Long aluno_id = daoAluno.listarIdPorNomeTurma("Aluno", aluno2, turma_id);
					model.addAttribute("resultado", 3L);
					model.addAttribute("emprestimos", 
							daoEmprestimo.listarNotNullEntidade("Emprestimo", "AlunoNaoDevolvidos1", aluno_id, "aluno_id", turma_id,"turma_id"));
				}
			}
				
		}else if(option.equals("professores")){
			if(selection != null){
				if(professor2.equals("Professor:")){
					model.addAttribute("resultado", 5L);
					model.addAttribute("emprestimos", 
							daoEmprestimo.listarNotNullEntidade("Emprestimo", "ProfessorDevolvidos2"));
				}else{
					Long professor_id = daoProfessor.listarIdPorNome("Professor", professor2);
					model.addAttribute("resultado", 5L);
					model.addAttribute("emprestimos", daoEmprestimo.listarNotNullEntidade
							("Emprestimo", "ProfessorDevolvidos1", professor_id, "professor_id", null, null));
				}
			}else{
				if(professor2.equals("Professor:")){
					model.addAttribute("resultado", 6L);
					model.addAttribute("emprestimos", 
							daoEmprestimo.listarNotNullEntidade("Emprestimo", "ProfessorNaoDevolvidos2"));
				}else{
					Long professor_id = daoProfessor.listarIdPorNome("Professor", professor2);
					model.addAttribute("resultado", 5L);
					model.addAttribute("emprestimos", daoEmprestimo.listarNotNullEntidade
							("Emprestimo", "ProfessorNaoDevolvidos1", professor_id, "professor_id", null, null));
				}
				
			}
		}
		return "emprestimos/emprestimos";
	}
	@RequestMapping("realizarEmprestimos")
	public String realizarEmprestimos(String tombo1, String aluno1, 
			String professor1, String turma1) throws Exception{
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmprestimoFormatada(Calendar.getInstance().getTime().toString());
		Livro livro = daoLivro.listarPorId(Livro.class, tombo1);
		emprestimo.setLivro(livro);
		if(aluno1 != null){
			Long turma_id = daoTurma.listarIdPorNome("Turma", turma1);
			Long aluno_id = daoAluno.listarIdPorNomeTurma("Aluno", aluno1, turma_id);
			Aluno aluno2 = daoAluno.listarPorId(Aluno.class, aluno_id);
			emprestimo.setAluno(aluno2);
			emprestimo.setTurma(aluno2.getTurma());
			
		}else if(professor1 != null){
			Long professor_id = daoProfessor.listarIdPorNome("Professor", professor1);
			Professor professor2 = daoProfessor.listarPorId(Professor.class, professor_id);
			emprestimo.setProfessor(professor2);
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
	@RequestMapping("alterarEmprestimo")
	public String alterarEmprestimo(String id, String tombo, String aluno,String turma, String professor,
			String dataEmprestimo, String dataDevolucao) throws Exception{
		
		Emprestimo emprestimo = daoEmprestimo.listarPorId(Emprestimo.class, Long.parseLong(id));
		System.out.println("Emprestimo: " + emprestimo);
		if((tombo != null) && (dataEmprestimo != null)){
			Livro Objlivro = daoLivro.listarPorId(Livro.class, tombo);
			System.out.println("Objlivro: " + Objlivro);
			emprestimo.setLivro(Objlivro);
			
			if((aluno != null) && (turma != null)){
				Long turma_id = daoTurma.listarIdPorNome("Turma", turma);
				System.out.println("Turma: " + turma_id);
				Long aluno_id = daoAluno.listarIdPorNomeTurma("Aluno", aluno, turma_id);
				System.out.println("Id do Aluno: " + aluno_id);
				Aluno Objaluno = daoAluno.listarPorId(Aluno.class, aluno_id);
				System.out.println("Aluno: " + Objaluno);
				emprestimo.setAluno(Objaluno);
				emprestimo.setTurma(Objaluno.getTurma());
			}else if(professor != null){
				Long professor_id = daoProfessor.listarIdPorNome("Professor", professor);
				System.out.println("Id do professor: " + professor_id);
				Professor Objprofessor = daoProfessor.listarPorId(Professor.class, professor_id);
				System.out.println("Professor: "+ Objprofessor);
				emprestimo.setProfessor(Objprofessor);
			}
			daoEmprestimo.alterar(emprestimo);
		}
		return "redirect:listarTodosEmprestimos";
		
	}
}
