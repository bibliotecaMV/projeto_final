package br.com.bibliotecaltv.controller.javabeans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="exemplares")
public class Exemplar implements Serializable{
	
	@Id
	private String tombo_livro;
	
	@Id
	private Long id_exemplar;
	
	@Column(nullable = false)
	private boolean alugado;

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public String getTombo_livro() {
		return tombo_livro;
	}

	public void setTombo_livro(String tombo_livro) {
		this.tombo_livro = tombo_livro;
	}

	public Long getId_exemplar() {
		return id_exemplar;
	}

	public void setId_exemplar(Long id_exemplar) {
		this.id_exemplar = id_exemplar;
	}
	
	
	
}
