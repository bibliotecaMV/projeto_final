package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.MonitoresDAO;

@Controller
public class MonitorController {
	
	private MonitoresDAO dao;
	
	@Autowired
	public MonitorController(MonitoresDAO dao){
		this.dao = dao;
	}
	
	
	@RequestMapping("realizarEmprestimo")
	public String realizaEmprestimo(Emprestimo emprestimo){
		dao.realizaEmprestimo(emprestimo);
		return "";
	}
	
}
