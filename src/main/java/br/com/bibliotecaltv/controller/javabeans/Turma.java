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
@NamedQueries({	
	@NamedQuery(name="Turma.listarTurma", query="SELECT turma FROM Turma turma"),
})
@Table(name = "turmas")
@NamedQueries({ @NamedQuery(name = "turmas.buscarId", query = "select turmas from Turma turma where turma.id = :id"),
        @NamedQuery(name = "turmas.buscarTurma", query = "select turmas from Turma turma where turma.turma = :turma")})
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String turma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
}
