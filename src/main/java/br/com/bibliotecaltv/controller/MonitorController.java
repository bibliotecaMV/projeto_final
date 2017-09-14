package br.com.bibliotecaltv.controller;

import org.springframework.stereotype.Controller;

import br.com.bibliotecaltv.dao.MonitoresDAO;

@Controller
public class MonitorController {
	private MonitoresDAO dao;
	public MonitorController(MonitoresDAO dao){
		this.dao = dao;
	}
}
