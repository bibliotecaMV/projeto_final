package br.com.bibliotecaltv.controller.javabeans;

import java.util.Date;

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
		@NamedQuery(name = "Emprestimo.listarEmprestimo", query = "SELECT emprestimo FROM Emprestimo emprestimo"),
		@NamedQuery(name = "Emprestimo.buscarIdProfessor", query = "select id from Emprestimo emprestimo"
				+ " where livro_tombo = :livro_tombo and genero_id = :genero_id and professor_id = :professor_id and "
				+ "dataEmprestimo = :dataEmprestimo"),
		@NamedQuery(name = "Emprestimo.buscarIdAluno", query = "select id from Emprestimo emprestimo"
				+ " where livro_tombo = :livro_tombo and genero_id = :genero_id and "
				+ "aluno_id = :aluno_id and turma_id = :turma_id and dataEmprestimo = :dataEmprestimo") })
@Table(name = "emprestimos")
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private Date dataEmprestimo;

	@Column(nullable = true)
	private Date dataDevolucao;

	@ManyToOne
	@JoinColumn(nullable = true)
	private Aluno aluno;

	@ManyToOne
	@JoinColumn(nullable = true)
	private Turma turma;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Livro livro;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Genero genero;

	@ManyToOne
	@JoinColumn(nullable = true)
	private Professor professor;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", dataEmprestimo=" + dataEmprestimo
				+ ",  datadevolucao=" + dataDevolucao + "]";
	}
}
