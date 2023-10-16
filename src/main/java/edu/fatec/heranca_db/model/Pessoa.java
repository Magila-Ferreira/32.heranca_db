package edu.fatec.heranca_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class Pessoa implements Serializable {

	@Column(length = 50, nullable = false)
	private String nome;

	@Column(length = 12)
	private String rg;

	@Column(length = 16)
	private String cpf;

	@Column(length = 25)
	private String pai;

	@Column(length = 25)
	private String mae;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
	}
}
