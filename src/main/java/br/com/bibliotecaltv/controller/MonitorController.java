package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Aluno;
import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.MonitoresDAO;

@Controller
public class MonitorController {
	MonitoresDAO dao;
	AlunoDAO dao1;
	
	@Autowired
	public MonitorController(MonitoresDAO dao,AlunoDAO dao1){
		this.dao = dao;
		this.dao1 = dao1;
	}
	
	@RequestMapping("realizarLoginMonitor")
	public String realizarLogin(){
		return "teste.monitor/loginMonitor";
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
	
	@RequestMapping("listarMonitores")
	public String listarMonitor(Model model) {
		model.addAttribute("monitores", dao.listar(Monitores.class));
		model.addAttribute("alunos", dao1.listar(Aluno.class));
		return "Monitor"; 
	}
	
	@RequestMapping("adicionarMonitores")
	public String adicionaMonitores(String usuario, String senha, String aluno) {
		Monitores monitores = new Monitores();
		monitores.setUsuario(usuario);
		monitores.setSenha(senha);
		
		return "redirect:listarMonitores";
	}
	
	@RequestMapping("deletaMonitores")
	public String deletaProfessor(Long id) throws Exception {
		Monitores monitores = dao.listarPorId(Monitores.class, id);
		dao.excluir(monitores);
		return "redirect:listarMonitores";
	}
}
