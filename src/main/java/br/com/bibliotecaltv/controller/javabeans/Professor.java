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
@Table(name="professores")
@NamedQueries({ 
	@NamedQuery(name="Professor.listarProfessor", query="SELECT professor FROM Professor professor"),
	@NamedQuery(name = "Professor.buscarId", query = "select id from Professor professor where nome_completo = :nome_completo"),
	@NamedQuery(name="Professor.listarPorId", query="select professor from Professor professor where id = :id")
})

public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome_completo", nullable = false)
	private String nomeCompleto;
	
	@Column(name="matricula", nullable = false)
	private Long matricula;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Professor [id=" + id + ", matricula=" + matricula + ", nome_completo=" + nomeCompleto + "]";
	}
	
}