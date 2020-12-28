package br.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Login")
@NamedQuery(name="Login.findAll",query="SELECT l FROM Login l")
public class Login implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="matricula",unique = true)
	private String matricula;
	private String senha;
	
	public Login() {
		super();
	}
	public Login(String matricula, String senha) {
		super();
		this.matricula = matricula;
		this.senha = senha;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula= matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Login [matricula=" + matricula + ", senha=" + senha + "]";
	}
	
	
}
