package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.bibliotecaltv.dao.TurmaDAO;

@Controller
public class TurmaController {
	TurmaDAO dao;
	
	@Autowired
	public TurmaController(TurmaDAO dao){
		this.dao = dao;
	}
}
