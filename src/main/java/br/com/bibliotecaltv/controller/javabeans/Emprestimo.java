package br.com.bibliotecaltv.controller.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimos")
public class Emprestimo {
	
	@Id
	private Long tombo;

	@Column(nullable = false)
	private String dataEmprestimo;
	
	@Column(nullable = false)
	private String dataDevolucao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Turma turma;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Livro livro;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Genero genero;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Professor professor;
	
	public Long getTombo() {
		return tombo;
	}

	public void setTombo(Long tombo) {
		this.tombo = tombo;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
