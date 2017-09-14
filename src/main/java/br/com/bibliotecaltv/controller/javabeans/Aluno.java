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
@Table(name="alunos")
@NamedQueries({ 
	@NamedQuery(name="Aluno.listarAluno", query="SELECT aluno FROM Aluno aluno"),
	@NamedQuery(name = "alunos.buscarId", query = "select aluno from Aluno aluno where aluno.id = :id"),
    @NamedQuery(name = "alunos.buscarAluno", query = "select nome from Aluno aluno where aluno.nome = :nome")})
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="numero", nullable = false)
	private int numero;
	
	@Column(name="matricula", nullable = false)
	private Long matricula;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Turma turma;
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
}
