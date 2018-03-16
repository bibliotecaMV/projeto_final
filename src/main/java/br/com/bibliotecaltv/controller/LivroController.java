package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Exemplar;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.ExemplarDAO;
import br.com.bibliotecaltv.dao.GeneroDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

@Controller
public class LivroController {
	LivroDAO daoLivro;
    GeneroDAO daoGenero;
    ExemplarDAO daoExemplar;

	@Autowired
	public LivroController(LivroDAO daoLivro, GeneroDAO daoGenero, ExemplarDAO daoExemplar) {
		this.daoLivro = daoLivro;
		this.daoGenero = daoGenero;
		this.daoExemplar = daoExemplar;
	}

	@RequestMapping("adicionarLivros")
	public String adicionaLivro(String tombo, String forma_aquisicao, String forma_aquisicao2, String titulo, String autor, Long volume,
			Long exemplares, String editora, String local_edicao, String ano_editado, String genero)
			throws Exception {
		Livro livro = new Livro();
		livro.setTombo(tombo);
		if(forma_aquisicao2 == null) {
			livro.setForma_aquisicao(forma_aquisicao);
		}else {
			livro.setForma_aquisicao(forma_aquisicao2);
		}
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setVolume(volume);
		livro.setExemplares(exemplares);
		for(int i = 1; i <= exemplares; i++) {
			Exemplar exemplar = new Exemplar();
			exemplar.setId_exemplar(Long.valueOf(i));
			exemplar.setTombo_livro(tombo);
			exemplar.setAlugado(false);
			daoExemplar.salvar(exemplar);
		}
		livro.setEditora(editora);
		livro.setLocal_edicao(local_edicao);
		livro.setAno_editado(Long.parseLong(ano_editado));
		Long genero_id = daoGenero.listarIdPorNome("Genero", genero);
		Genero genero1 = daoGenero.listarPorId(Genero.class, genero_id);
		livro.setCDD(genero1.getSigla());
		livro.setGenero(genero1);
		daoLivro.salvar(livro);
		return "redirect:listaLivros";
	}

	@RequestMapping("listaLivros")
	public String listaLivros(Model model) {
		model.addAttribute("livros", daoLivro.listar(Livro.class));
		model.addAttribute("generos", daoGenero.listar(Genero.class));
		return "livro/livros";
	}
	

	@RequestMapping("deletarLivro")
	public String deletaLivro (String id) throws Exception {
		Livro livro = daoLivro.listarPorId(Livro.class, id);
		daoLivro.excluir(livro);
		return "redirect:listaLivros";
	}
	
	@RequestMapping("listarLivroNaTable")
	public String listarLivroNaTable(String titulo, Model model) {
		if(titulo.equals("")) {
			return "redirect:listaLivros";
		}else {
			model.addAttribute("livros", 
					daoLivro.listarEntidadePorNome("Livro","livro", "titulo", titulo));
			model.addAttribute("generos", daoGenero.listar(Genero.class));
		}
		return "livro/livros";
	}
	
	@RequestMapping("alterarLivro")
	public String alterarLivro(String tombo, String titulo, 
			String autor, Long exemplares, String genero ) throws Exception {
		Livro livro = daoLivro.listarPorId(Livro.class, tombo);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setExemplares(exemplares);
		Long genero_id = daoGenero.listarIdPorNome("Genero", genero);
		Genero genero1 = daoGenero.listarPorId(Genero.class, genero_id);
		livro.setGenero(genero1);
		daoLivro.alterar(livro);
		return "redirect:listaLivros";
	}
	
	@RequestMapping("sobreLivros")
	public String sobreLivro() {
		return "redirect:listaLivros";
	}

}
