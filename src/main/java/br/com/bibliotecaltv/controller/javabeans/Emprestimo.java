package br.com.bibliotecaltv.controller.javabeans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
import javax.persistence.Transient;
@NamedQueries({
	@NamedQuery(name = "Emprestimo.listarNotNullAluno", 
			query = "select emprestimo from Emprestimo emprestimo where"
					+ " aluno_id is not null"),
	@NamedQuery(name = "Emprestimo.listarNotNullProfessor", 
			query = "select emprestimo from Emprestimo emprestimo where"
					+ " professor_id is not null")
})
@Entity	
@Table(name = "emprestimos")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = true)
	private Calendar dataEmprestimo;

	@Column(nullable = true)
	private Calendar dataDevolucao;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = true)
	private Aluno aluno;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = true)
	private Turma turma;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = false)
	private Livro livro;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = true)
	private Professor professor;

	@Transient
	private String dataEmprestimoFormatada;
	
	@Transient
	private String dataDevolucaoFormatada;
	
	
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

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public void setDataEmprestimoFormatada(String dataEmprestimo){
		Calendar date = new GregorianCalendar();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			date.setTime(sd.parse(dataEmprestimo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDataEmprestimo(date);
		this.dataEmprestimoFormatada = dataEmprestimo;
	}
	public String getDataEmprestimoFormatada(){
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try{
			this.dataEmprestimoFormatada = s.format(dataEmprestimo.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		return dataEmprestimoFormatada;
	}
	public void setDataDevolucaoFormatada(String dataDevolucao){
		Calendar date = new GregorianCalendar();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			date.setTime(sd.parse(dataDevolucao));
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDataDevolucao(date);
		this.dataDevolucaoFormatada = dataDevolucao;
	}
	public String getDataDevolucaoFormatada(){
		if(dataDevolucao != null){
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			try{
				this.dataDevolucaoFormatada = s.format(dataDevolucao.getTime());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return dataDevolucaoFormatada;
	}
	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", dataEmprestimo=" + dataEmprestimo
				+ ",  datadevolucao=" + dataDevolucao + "]";
	}
}
