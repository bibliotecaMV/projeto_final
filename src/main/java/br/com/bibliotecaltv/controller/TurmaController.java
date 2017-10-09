package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.TurmaDAO;

@Controller
public class TurmaController {
	private TurmaDAO dao;

	@Autowired
	public TurmaController(TurmaDAO dao) {
		this.dao = dao;
	}

	@RequestMapping("adicionaTurma")
	public String adiciona(String nome) {
		Turma turma = new Turma();
		turma.setNome(nome);
		dao.salvar(turma);
		return "redirect:listarTurmas";
	}

	@RequestMapping("listarTurmas")
	public String listarTurmas(Model model) {
		model.addAttribute("turmas", dao.listar(Turma.class));
		return "turma/funcTurma";
	}

	@RequestMapping("deletaTurmas")
	public String deletaATurma(Long id) throws Exception {
		Turma turma = dao.listarPorId(Turma.class, id);
		dao.excluir(turma);
		return "redirect:listarTurmas";
	}

	@RequestMapping("alterarTurma")
	public String alteraTurma(Long id, String nome) throws Exception {
		Turma turma = dao.listarPorId(Turma.class, id);
		turma.setNome(nome);
		dao.alterar(turma);
		return "redirect:listarTurmas";
	}

	@RequestMapping("sobreTurmas")
	public String sobreTurma() {
		return "redirect:listarTurmas";
	}

}
