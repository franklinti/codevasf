package br.com.model;

import java.io.Serializable;



public class Usuario{
	
	
	private String cpf;
	private String nome;
	private String sobrenome;
	
	public Usuario() {
		super();
	}

	public Usuario(String cpf, String nome, String sobrenome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}

	
}
