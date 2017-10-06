package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.TurmaDAO;

@Controller
public class AlunoController {
	AlunoDAO dao;
	TurmaDAO daoTurma;

	@Autowired
	public AlunoController(AlunoDAO dao, TurmaDAO daoTurma) {
		this.dao = dao;
		this.daoTurma = daoTurma;
	}

	@RequestMapping("listarAlunos")
	public String listarAlunos(Model model) {
		model.addAttribute("alunos", dao.listar(Aluno.class));
		model.addAttribute("turma", daoTurma.listar(Turma.class));
		return "aluno/funcAluno";
	}

	@RequestMapping("adicionarAluno")
	public String adicionaMonitores(String nome, Long numero, String matricula, String turma) throws Exception {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setNumero(numero);
		aluno.setMatricula(matricula);
		Long turma_id = daoTurma.listarIdPorNome("Turma", turma);
		Turma turma1 = daoTurma.listarPorId(Turma.class, turma_id);
		aluno.setTurma(turma1);
		dao.salvar(aluno);
		return "redirect:listarAlunos";
	}

	@RequestMapping("deletarAluno")
	public String deletaATurma(Long id) throws Exception {
		Aluno aluno = dao.listarPorId(Aluno.class, id);
		dao.excluir(aluno);
		return "redirect:listarAlunos";
	}
    
	@RequestMapping("alterarAluno")
	public String alteraAluno(Long id, String nome, Long numero, String matricula, String turma) throws Exception {
		Aluno aluno = dao.listarPorId(Aluno.class, id);
		aluno.setNome(nome);
		aluno.setNumero(numero);
		aluno.setMatricula(matricula);
		Long turma_id = daoTurma.listarIdPorNome("Turma", turma);
		Turma turma1 = daoTurma.listarPorId(Turma.class, turma_id);
		aluno.setTurma(turma1);
		dao.alterar(aluno);
		return "redirect:listarAlunos";
	}
	
	@RequestMapping("sobreAlunos")
	public String sobreAluno() {
		return "redirect:listarAlunos";
	}
}
