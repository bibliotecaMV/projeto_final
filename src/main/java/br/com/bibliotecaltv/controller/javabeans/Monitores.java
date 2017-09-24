package br.com.bibliotecaltv.controller.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name = "Monitores.realizarLogin", 
			query = "select monitores from Monitores monitores where"
					+ " usuario = :usuario and senha = :senha") 
})
@Table(name = "monitores")
public class Monitores {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "usuario", nullable = false)
	private String usuario;
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(unique=true, nullable = false)
	private Aluno aluno;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
		return "Monitores [id=" + id + ", usuario=" + usuario + ", senha=" + senha + "]";
	}
}
