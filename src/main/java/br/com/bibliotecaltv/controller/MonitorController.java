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
	
	@RequestMapping("realizarLoginMonitor")
	public String realizarLogin(){
		return "teste.monitor/testeLogin";
	}	
	@RequestMapping("verificarLoginMonitor")
	public String verificarLoginMonitor(Monitores monitor, HttpSession session){
		boolean verifica = dao.realizarLoginUsuario("Monitores", 
				monitor.getUsuario(), monitor.getSenha());
		if(verifica == true){
			session.setAttribute("usuarioLogadoMonitor", monitor);
			return "teste.monitor/loginDeuCerto";
		}else{
			return "redirect:realizarLoginMonitor";
		}
	}
	
	@RequestMapping("acessarFormularioLogadoMonitor")
	public String acessarFormularioLogado(){
		return "teste.monitor/acessarFormularioLogado";
	}
	
	@RequestMapping("logoutMonitor")
	public String encerrarSessao(HttpSession session){
		session.invalidate();
		return "redirect:realizarLoginMonitor";
	}
}
