package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

@Controller
public class AdministradorController {
	
	private AdministradorDAO dao;
	
	@Autowired
	public AdministradorController(AdministradorDAO dao){
		this.dao = dao;
	}
	
	@RequestMapping("adicionarAdministrador")
	public String adicionarAdministrador(Administrador administrador){
		dao.adicionarAdministrador(administrador);
		return "";
	}
	@RequestMapping("adicionarMonitor")
	public String adicionarMonitor(Monitores monitores){
		dao.adicionarMonitor(monitores);
		return "";
	}
}
