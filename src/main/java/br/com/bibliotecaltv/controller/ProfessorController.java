package br.com.bibliotecaltv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.ProfessorDAO;

@Controller
public class ProfessorController {

	ProfessorDAO dao;
	@Autowired
	public ProfessorController(ProfessorDAO dao) {
		this.dao = dao;
	}

	@RequestMapping("listarProfessores")
	public String listarProfessores(Model model) {
		model.addAttribute("professores", dao.listar(Professor.class));
		return "Professor";
	}

	@RequestMapping("adicionaProfessores")
	public String adicionaProfessores(Professor professor, BindingResult result) {
		dao.salvar(professor);
		return "redirect:listarProfessores";
	}

	@RequestMapping("deletaProfessores")
	public String deletaProfessor(Long id) throws Exception {
		Professor professor = dao.listarPorId(Professor.class, id);
		dao.excluir(professor);
		return "redirect:listarProfessores";
	}
	
	@RequestMapping("alterarProfessores")
	public String alterarProfessor(Professor professor) {
		dao.alterar(professor);
		return "redirect:listarProfessores";
	}

}
