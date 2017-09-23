package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.MonitoresDAO;

@Controller
public class MonitorController {
	MonitoresDAO dao;
	
	@Autowired
	public MonitorController(MonitoresDAO dao){
		this.dao = dao;
	}
	
	@RequestMapping("realizarLogin")
	public String realizarLogin(){
		return "teste.Monitor/testeLogin";
	}
	
	@RequestMapping("testeInterceptador")
	public String testeInterceptador(){
		return "teste.monitor/loginDeuCerto";
	}
	
	@RequestMapping("verificarLogin")
	public String verificarLoginMonitor(Monitores monitor, HttpSession session){
		boolean verifica = dao.realizarLoginMonitor("Monitores", 
				monitor.getLogin(), monitor.getSenha());
		if(verifica == true){
			session.setAttribute("usuarioLogado", monitor);
			return "teste.monitor/loginDeuCerto";
		}else{
			return "redirect:realizarLogin";
		}
	}
	
	@RequestMapping("acessarFormularioLogado")
	public String acessarFormularioLogado(){
		return "teste.monitor/acessarFormularioLogado";
	}
	
	@RequestMapping("logout")
	public String encerrarSessao(HttpSession session){
		session.invalidate();
		return "redirect:realizarLogin";
	}
}
