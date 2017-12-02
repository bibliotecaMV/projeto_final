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
@NamedQueries({
	@NamedQuery(name = "Genero.listarIdPorNome", query = "select id from Genero genero where" + " descricao = :descricao"), 
})
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String sigla_numerica;
	
	@Column(unique = true, nullable = false)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSiglaNumerica() {
		return sigla_numerica;
	}

	public void setSiglaNumerica(String sigla) {
		this.sigla_numerica = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Genero [id=" + id + ", descricao=" + descricao + ", sigla_numerica=" + sigla_numerica + "]";
	}
}
