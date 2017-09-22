package br.com.bibliotecaltv.controller.javabeans;

import java.util.Date;

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
	@NamedQuery(name="Emprestimo_Sesc.listar", query="SELECT emprestimo_Sesc FROM Emprestimo_Sesc emprestimo_Sesc"),
	
	@NamedQuery(name = "Emprestimo_Sesc.buscarIdProfessor", query = "select id from Emprestimo_Sesc emprestimo_Sesc"
			+ " where livro_tombo = :livro_tombo and genero_id = :genero_id and professor_id = :professor_id and "
			+ "dataEmprestimo = :dataEmprestimo"),
	@NamedQuery(name = "Emprestimo_Sesc.buscarIdAluno", query = "select id from Emprestimo_Sesc emprestimo_Sesc"
			+ " where livro_tombo = :livro_tombo and genero_id = :genero_id and "
			+ "aluno_id = :aluno_id and turma_id = :turma_id and dataEmprestimo = :dataEmprestimo")
})
@Table(name = "emprestimos_sesc")
public class Emprestimo_Sesc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String CDD;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String autor;
	
	@Column(nullable = false)
	private Date data_emprestimo;
	
	@Column(nullable = true)
	private Date data_devolucao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = true)
	private Professor professor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = true)
	private Aluno aluno;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = true)
	private Turma turma;

	@Column(nullable = false)
	private String tombo;
	
	public String getTombo() {
		return tombo;
	}

	public void setTombo(String tombo) {
		this.tombo = tombo;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(Date data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public Date getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(Date data_devolucao) {
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
	
	@Override
	public String toString() {
		return "Emprestimo_Sesc [id=" + id + ", CDD=" + CDD + ", titulo=" + titulo + ", autor=" + autor + ","
				+ " data_emprestimo=" + data_emprestimo + ",  data_devolucao=" +  data_devolucao + "]";
	}
}

