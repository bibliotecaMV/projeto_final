package br.com.bibliotecaltv.javabeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimos")
public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tombo;

	@Column(nullable = false)
	private String dataEmprestimo;
	
	@Column(nullable = false)
	private String dataDevolucao;
	
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
}
