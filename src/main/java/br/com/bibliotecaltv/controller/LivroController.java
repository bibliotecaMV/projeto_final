package br.com.bibliotecaltv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.GeneroDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

@Controller
public class LivroController {
	LivroDAO daoLivro;
    GeneroDAO daoGenero;

	@Autowired
	public LivroController(LivroDAO daoLivro, GeneroDAO daoGenero) {
		this.daoLivro = daoLivro;
		this.daoGenero = daoGenero;

	}

	@RequestMapping("adicionarLivros")
	public String adicionaLivro(String tombo, String forma_aquisicao, String titulo, String autor, Long volume,
			Long exemplares, String editora, String local_edicao, String ano_editado, String genero)
			throws Exception {
		Livro livro = new Livro();
		livro.setTombo(tombo);
		livro.setForma_aquisicao(forma_aquisicao);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setVolume(volume);
		livro.setExemplares(exemplares);
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
	public String deletaLivro(Long id) throws Exception {
		Livro livro = daoLivro.listarPorId(Livro.class, id);
		daoLivro.excluir(livro);
		return "redirect:listaLivros";
	}
	
	@RequestMapping("sobreLivros")
	public String sobreLivro() {
		return "redirect:listaLivros";
	}

}
