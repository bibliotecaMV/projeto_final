package br.com.bibliotecaltv.controller.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
	@Id
	private String tombo;
	
	@Column(nullable = false)
	private String CDD;
	
	@Column(nullable = false)
	private String forma_aquisicao;
	
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = false)
	private Genero genero;
	
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
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
	public String getTombo() {
		return tombo;
	}
	public void setTombo(String tombo) {
		this.tombo = tombo;
	}
	public String getCDD() {
		return CDD;
	}
	public void setCDD(String CDD) {
		this.CDD = CDD;
	}
	public String getForma_aquisicao() {
		return forma_aquisicao;
	}
	public void setForma_aquisicao(String forma_aquisicao) {
		this.forma_aquisicao = forma_aquisicao;
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
	
	@Override
	public String toString() {
		return "Livro [tombo=" + tombo + ", CDD=" + CDD + ", titulo=" + titulo + ", autor=" + autor + ","
				+ " forma_aquisicao=" +forma_aquisicao + ",  volume=" +  volume + ",  exemplares=" +  exemplares + ","
						+ " editora=" + editora + ", local_edicao=" + local_edicao + ", ano_editado=" + ano_editado + "]";
	}
}
