package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("listarProfessores0")
	public String listarProfessores(Model model) {
		model.addAttribute("emprestimos", dao.listar(Professor.class));
		return "Professor";
	}
}
