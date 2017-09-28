package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping("listarProfessores")
	public String listarProfessores(Model model) {
		model.addAttribute("professores", dao.listar(Professor.class));
		return "Professor";
	}
	
	@RequestMapping("logout")
	 public String logout(HttpSession session) {
	   session.invalidate();
	   return "redirect:realizarLoginAdministrador";
	 }
}
