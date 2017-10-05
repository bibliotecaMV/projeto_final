package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpSession;
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

	@RequestMapping("mostrarPainelAdministrador")
	public String mostrarPainelAdministrador() {
		return "administrador/painelAdministrador";
	}

	@RequestMapping("verificarLoginAdministrador")
	public String verificarLogin(Administrador administrador, HttpSession session) {
		boolean verifica = dao.realizarLoginUsuario("Administrador", administrador.getUsuario(),
				administrador.getSenha());
		if (verifica == true) {
			session.setAttribute("usuarioLogadoAdministrador", administrador);
			return "administrador/painelAdministrador";
		} else {

			return "redirect:realizarLoginAdministrador";
		}
	}

	@RequestMapping("acessarFormularioLogadoAdministrador")

	public String acessarFormularioLogado() {
		return "administrador/acessarFormularioLogadoAdministrador";
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
	public String adicionaAdministrador(Administrador administrador, BindingResult result) {
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

}
