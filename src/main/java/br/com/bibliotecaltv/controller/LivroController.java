package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.bibliotecaltv.dao.LivroDAO;

@Controller
public class LivroController {
	LivroDAO dao;
	
	@Autowired
	public LivroController(LivroDAO dao){
		this.dao = dao;
	}
}
