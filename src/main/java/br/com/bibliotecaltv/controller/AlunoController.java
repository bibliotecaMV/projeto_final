package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.bibliotecaltv.dao.AlunoDAO;

@Controller
public class AlunoController {
	AlunoDAO dao;
	@Autowired
	public AlunoController(AlunoDAO dao){
		this.dao = dao;
	}

}
