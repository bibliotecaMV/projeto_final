package br.com.bibliotecaltv.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
		if((tombo != null) && (dataEmprestimo != null)){
			Livro Objlivro = daoLivro.listarPorId(Livro.class, tombo);
			emprestimo.setLivro(Objlivro);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = sdf.parse(dataEmprestimo);
			Calendar calendar = sdf.getCalendar();
			calendar.setTime(date);
			System.out.println(calendar.toString());
			emprestimo.setDataEmprestimoFormatada(calendar.toString());
			
			if((aluno != null) && (turma != null)){
				Long turma_id = daoTurma.listarIdPorNome("Turma", turma);
				Long aluno_id = daoAluno.listarIdPorNomeTurma("Aluno", aluno, turma_id);
				Aluno Objaluno = daoAluno.listarPorId(Aluno.class, aluno_id);
				emprestimo.setAluno(Objaluno);
				emprestimo.setTurma(Objaluno.getTurma());
			}else if(professor != null){
				Long professor_id = daoProfessor.listarIdPorNome("Professor", professor);
				Professor Objprofessor = daoProfessor.listarPorId(Professor.class, professor_id);
				emprestimo.setProfessor(Objprofessor);
			}
			if(dataDevolucao != null){
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date date2 = sdf2.parse(dataEmprestimo);
				Calendar calendar2 = sdf2.getCalendar();
				calendar2.setTime(date2);
				System.out.println(calendar2.toString());
				emprestimo.setDataDevolucaoFormatada(calendar2.toString());
			}
		}
		return "redirect:listarTodosEmprestimos";
		
	}
}
