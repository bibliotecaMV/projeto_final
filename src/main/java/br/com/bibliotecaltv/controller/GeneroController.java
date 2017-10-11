package br.com.bibliotecaltv.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

@Controller
public class GeneroController {
	GeneroDAO dao;
	@Autowired
	public GeneroController(GeneroDAO dao){
		this.dao = dao;
	}
	@RequestMapping("listarGeneros")
	public String listarGeneros(Model model){
		model.addAttribute("generos", dao.listar(Genero.class));
		return "genero/genero";
	}
	@RequestMapping("cadastrarGenero")
	public String cadastrarGenero(Genero genero){
		dao.salvar(genero);
		System.out.println("salvo!");
		return "redirect:listarGeneros";
	}
	@RequestMapping("excluirGenero")
	public void excluirGenero(Long id, HttpServletResponse response) throws Exception{
		System.out.println(id);
		Genero genero = dao.listarPorId(Genero.class, id);
		dao.excluir(genero);
		response.setStatus(200);
	}
	@RequestMapping("alterarGenero")
	public String alterarGenero(Long id, String descricao, String sigla) throws Exception{
		Genero genero = dao.listarPorId(Genero.class, id);
		genero.setDescricao(descricao);
		genero.setSigla(sigla);
		dao.alterar(genero);
		return "redirect:listarGeneros";
	}
	
	@RequestMapping("listarGenerosNaTable")
	public String listarGenerosNaTable(String descricao2, Model model){
		if((descricao2.equals(""))){
			return "redirect:listarGeneros";
		}else{
			model.addAttribute("generos", 
			dao.listarEntidadePorNome("Genero", "genero", "descricao", descricao2));
			return "genero/genero";
		}
		
	}
	
}	
