package br.com.bibliotecaltv.controller.javabeans;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({	
	@NamedQuery(name="Emprestimo_Sesc.listarEmprestimo_Sesc", query="SELECT emprestimo_Sesc FROM Emprestimo_Sesc emprestimo_Sesc"),
})
@Table(name = "emprestimos_sesc")
public class Emprestimo_Sesc {
	
	@Id
	private Long tombo;
	
	@Column(nullable = false)
	private String CDD;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String autor;
	
	@Column(nullable = false)
	private Calendar data_emprestimo;
	
	@Column(nullable = true)
	private Calendar data_devolucao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Professor professor;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Turma turma;

	public Long getTombo() {
		return tombo;
	}

	public void setTombo(Long tombo) {
		this.tombo = tombo;
	}

	public String getCDD() {
		return CDD;
	}

	public void setCDD(String cDD) {
		CDD = cDD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Calendar getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(Calendar data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public Calendar getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(Calendar data_devolucao) {
		this.data_devolucao = data_devolucao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
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
	
	
}