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
	@NamedQuery(name="Administrador.listar", query="SELECT administrador FROM Administrador administrador"),
	@NamedQuery(name="Administrador.buscarId", query= "SELECT id FROM Administrador administrador WHERE usuario = :usuario and senha = :senha"),
	@NamedQuery(name="Administrador.buscarPorId", query="SELECT administrador FROM Administrador administrador WHERE id = :id")
})
@Table(name = "Administradores")
public class Administrador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String usuario;
	
	@Column(nullable = false)
	private String senha;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Administrador [id=" + id + ", senha=" + senha + ", usuario=" + usuario + "]";
	}
}

