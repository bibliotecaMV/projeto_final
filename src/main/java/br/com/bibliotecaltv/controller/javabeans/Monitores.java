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
@NamedQueries({	
	@NamedQuery(name="Monitores.listarMonitores", query="SELECT monitores FROM Monitores monitores"),
	@NamedQuery(name = "Monitores.listarPorId", query = "select monitores from Monitores monitores where id = :id"),
	@NamedQuery(name = "Monitores.buscarId", query = "select id from Monitores monitores where nome = :nome and senha = :senha")
})
@Table(name = "monitores")
public class Monitores {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "senha", nullable = false)
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Monitores [id=" + id + ", nome=" + nome + ", senha=" + senha + "]";
	}
}
