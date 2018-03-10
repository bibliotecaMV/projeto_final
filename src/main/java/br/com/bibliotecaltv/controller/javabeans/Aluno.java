package br.com.bibliotecaltv.controller.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
		@NamedQuery(name = "Aluno.listarIdPorNomeTurma", query = "select id from Aluno aluno where"
				+ " nome = :nome and turma_id = :turma_id"),
		@NamedQuery(name = "Aluno.listarPorFK", query = "select aluno from Aluno aluno where"
				+ " turma_id = :turma_id"),
		@NamedQuery(name = "Aluno.listarNomePorFK", query = "select nome from Aluno aluno where"
				+ " turma_id = :turma_id")})
@Table(name = "alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true, name = "nome", nullable = false)
	private String nome;

	@Column(name = "numero", nullable = false)
	private Long numero;

	@Column(unique = true, name = "matricula", nullable = false)
	private String matricula;

	@ManyToOne(fetch = FetchType.EAGER)
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

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", numero=" + numero + "]";
	}

}
