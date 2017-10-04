package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

@Controller
public class AdministradorController {
	AdministradorDAO dao;

	@Autowired
	public AdministradorController(AdministradorDAO dao) {
		this.dao = dao;
	}

	@RequestMapping("realizarLoginAdministrador")
	public String realizarLogin() {
		return "administrador/loginAdministrador";
	}

	@RequestMapping("verificarLoginAdministrador")
	public String verificarLogin(Administrador administrador, HttpSession session) {
		boolean verifica = dao.realizarLoginUsuario("Administrador", administrador.getUsuario(),
				administrador.getSenha());
		if (verifica == true) {
			session.setAttribute("usuarioLogadoAdministrador", administrador);
			return "administrador/loginDeuCerto";
		} else {
			return "redirect:realizarLoginAdministrador";
		}
	}

	@RequestMapping("acessarFormularioLogadoAdministrador")
	public String acessarFormularioLogado() {
		return "administrador/acessarFormularioLogado";
	}

	@RequestMapping("logoutAdministrador")
	public String encerrarSessao(HttpSession session) {
		session.invalidate();
		return "redirect:realizarLoginAdministrador";
	}

	@RequestMapping("listaAdministradores")
	public String listaAdministrador(Model model) {
		model.addAttribute("administradores", dao.listar(Administrador.class));
		return "administrador/FuncAdministrador";
	}

	@RequestMapping("adicionaAdministrador")
	public String adicionaAdministrador(@Valid Administrador administrador, BindingResult result) {
		dao.salvar(administrador);
		return "redirect:listaAdministradores";
	}

	@RequestMapping("deletaAdministrador")
	public String deletaAdministrador(Long id) throws Exception {
		Administrador administrador = dao.listarPorId(Administrador.class, id);
		dao.excluir(administrador);
		return "redirect:listaAdministradores";
	}

	@RequestMapping("sobreAdministrador")
	public String sobreTurma() {
		return "redirect:listaAdministradores";
	}
	
	@RequestMapping("alteraAdministrador")
	public String alteraAdm(Administrador adm, String usuario, Long id ) throws Exception {
		Administrador administrador = dao.listarPorId(Administrador.class, id);
		adm.setUsuario(usuario);
		dao.alterar(adm);
	    return "redirect:listaAdministradores";
	}
	
	
}
