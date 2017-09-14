package br.com.bibliotecaltv.controller.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="generos")
@NamedQueries({@NamedQuery(name = "Genero.pegarId", query = "select id from Genero genero where genero.descricao = :descricao"),
	@NamedQuery(name = "Genero.buscarGenero", query = "select genero from Genero genero where genero.id = :id"),
	@NamedQuery(name="Genero.listarGenero", query="SELECT genero FROM Genero genero")})
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String sigla;
	
	@Column(nullable = false)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
