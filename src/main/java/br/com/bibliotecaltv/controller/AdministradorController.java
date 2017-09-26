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
	
	@RequestMapping("realizarLoginAdministrador")
	public String realizarLogin(){
		return "index";
	}	
	@RequestMapping("verificarLoginAdministrador")
	public String verificarLogin(Administrador administrador, HttpSession session){
		boolean verifica = dao.realizarLoginUsuario("Administrador", 
				administrador.getUsuario(), administrador.getSenha());
		if(verifica == true){
			session.setAttribute("usuarioLogadoAdministrador", administrador);
			return "teste.administrador/loginDeuCerto";
		}else{
			return "redirect:realizarLoginAdministrador";
		}
	}
	
	@RequestMapping("acessarFormularioLogadoAdministrador")
	public String acessarFormularioLogado(){
		return "teste.administrador/acessarFormularioLogado";
	}
	
	@RequestMapping("logoutAdministrador")
	public String encerrarSessao(HttpSession session){
		session.invalidate();
		return "redirect:realizarLoginAdministrador";
	}
}
