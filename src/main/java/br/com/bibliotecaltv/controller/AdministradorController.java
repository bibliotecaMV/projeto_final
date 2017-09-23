package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

@Controller
public class AdministradorController {
	AdministradorDAO dao;
	
	@Autowired
	public AdministradorController(AdministradorDAO dao){
		this.dao = dao;
	}
	
	@RequestMapping("realizarLogin")
	public String realizarLogin(){
		return "teste.administrador/testeLogin";
	}
	
	@RequestMapping("testeInterceptador")
	public String testeInterceptador(){
		return "teste.administrador/loginDeuCerto";
	}
	
	@RequestMapping("verificarLogin")
	public String verificarLogin(Administrador administrador, HttpSession session){
		boolean verifica = dao.realizarLogin("Administrador", 
				administrador.getUsuario(), administrador.getSenha());
		if(verifica == true){
			session.setAttribute("administradorLogado", administrador);
			return "teste.administrador/loginDeuCerto";
		}else{
			return "redirect:realizarLogin";
		}
	}
	
	@RequestMapping("acessarFormularioLogado")
	public String acessarFormularioLogado(){
		return "teste.administrador/acessarFormularioLogado";
	}
	
	@RequestMapping("logout")
	public String encerrarSessao(HttpSession session){
		session.invalidate();
		return "redirect:realizarLogin";
	}
}
