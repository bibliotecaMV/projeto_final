package br.com.bibliotecaltv.controller.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column(name = "login", nullable = false)
	private String login;
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Aluno aluno;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	@Override
	public String toString() {
		return "Monitores [id=" + id + ", login=" + login + ", senha=" + senha + "]";
	}
}
