package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Aluno;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AlunoDAO;
import br.com.bibliotecaltv.dao.MonitoresDAO;
import br.com.bibliotecaltv.dao.TurmaDAO;

@Controller
public class MonitorController {
	MonitoresDAO dao;
	AlunoDAO dao1;
	TurmaDAO dao2;

	@Autowired
	public MonitorController(MonitoresDAO dao, AlunoDAO dao1, TurmaDAO dao2) {
		this.dao = dao;
		this.dao1 = dao1;
		this.dao2 = dao2;
	}

	@RequestMapping("realizarLoginMonitor")
	public String realizarLogin() {
		return "monitor/loginMonitor";
	}

	@RequestMapping("verificarLoginMonitor")
	public String verificarLoginMonitor(Monitores monitor, HttpSession session) {
		boolean verifica = dao.realizarLoginUsuario("Monitores", monitor.getUsuario(), monitor.getSenha());
		if (verifica == true) {
			session.setAttribute("usuarioLogadoMonitor", monitor);
			return "monitor/loginDeuCerto";
		} else {
			return "redirect:realizarLoginMonitor";
		}
	}

	@RequestMapping("acessarFormularioLogadoMonitor")
	public String acessarFormularioLogado() {
		return "monitor/painelMonitor";
	}

	@RequestMapping("logoutMonitor")
	public String encerrarSessao(HttpSession session) {
		session.invalidate();
		return "redirect:realizarLoginMonitor";
	}

	@RequestMapping("listarMonitores")
	public String listarMonitor(Model model) {
		model.addAttribute("monitores", dao.listar(Monitores.class));	
		model.addAttribute("alunos", dao1.listar(Aluno.class));
		model.addAttribute("turmas", dao2.listar(Turma.class));
		return "monitor/monitor";
	}

	@RequestMapping("adicionarMonitores")
	public String adicionaMonitores(String usuario, String senha, String aluno, String turma) throws Exception {
		Monitores monitores = new Monitores();
		monitores.setUsuario(usuario);
		monitores.setSenha(senha);
		Long turma_id = dao2.listarIdPorNome("Turma", turma);
		Long aluno_id = dao1.listarIdPorNomeTurma("Aluno", aluno, turma_id);
		Aluno aluno1 = dao1.listarPorId(Aluno.class, aluno_id);
		monitores.setAluno(aluno1);
		dao.salvar(monitores);
		return "redirect:listarMonitores";
	}

	@RequestMapping("deletaMonitores")
	public String deletaProfessor(Long id) throws Exception {
		Monitores monitores = dao.listarPorId(Monitores.class, id);
		dao.excluir(monitores);
		return "redirect:listarMonitores";
	}
    
	@RequestMapping("alterarMonitores")
	public String alterarMonitores(Long id, String usuario, String senha, String aluno, String turma) throws Exception{
		Monitores monitores = dao.listarPorId(Monitores.class, id);
		Long turma_id = dao2.listarIdPorNome("Turma", turma);
		Long aluno_id = dao1.listarIdPorNomeTurma("Aluno", aluno, turma_id);
		Aluno aluno1 = dao1.listarPorId(Aluno.class, aluno_id);
		monitores.setSenha(senha);
		monitores.setUsuario(usuario);
		monitores.setAluno(aluno1);
		try {
			dao.alterar(monitores);
		}catch(Exception e) {
			e.printStackTrace();
		}
	    
		return "redirect:listarMonitores";
	}
	
	@RequestMapping("listarMonitoresNaTable")
	public String ListarMonitoresNaTable(String usuario, Model model) {
		if(usuario.equals("")) {
			return "redirect:listarMonitores";
		}else {
			model.addAttribute("monitores", dao.listarEntidadePorUsuario("Monitores", usuario));
		}
		return "monitor/monitor";
	}
}
