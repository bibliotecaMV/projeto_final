package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.bibliotecaltv.dao.AdministradorDAO;

@Controller
public class AdministradorController {
	
	private AdministradorDAO dao;
	@Autowired
	public AdministradorController(AdministradorDAO dao){
		this.dao = dao;
	}
}
