package br.com.bibliotecaltv.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "livros")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tombo;
	
	@Column(nullable = false)
	private String CDD;
	
	@Column(nullable = false)
	private String forma_arquisicao;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String autor;
	
	@Column(nullable = false)
	private Long volume;
	
	@Column(nullable = false)
	private Long exemplares;
	
	@Column(nullable = false)
	private String editora;
	
	@Column(nullable = false)
	private String local_edicao;
	
	@Column(nullable = false)
	private Long ano_editado;
	
	@ManyToOne
	private Genero id_genero;
	
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public Long getExemplares() {
		return exemplares;
	}
	public void setExemplares(Long exemplares) {
		this.exemplares = exemplares;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getLocal_edicao() {
		return local_edicao;
	}
	public void setLocal_edicao(String local_edicao) {
		this.local_edicao = local_edicao;
	}
	public Long getAno_editado() {
		return ano_editado;
	}
	public void setAno_editado(Long ano_editado) {
		this.ano_editado = ano_editado;
	}
	public Long getTombo() {
		return tombo;
	}
	public void setTombo(Long tombo) {
		this.tombo = tombo;
	}
	public String getCDD() {
		return CDD;
	}
	public void setCDD(String CDD) {
		this.CDD = CDD;
	}
	public String getForma_arquisicao() {
		return forma_arquisicao;
	}
	public void setForma_arquisicao(String forma_arquisicao) {
		this.forma_arquisicao = forma_arquisicao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
