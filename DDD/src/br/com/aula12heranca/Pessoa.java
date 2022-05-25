package br.com.aula12heranca;

import java.util.Date;

public class Pessoa {
	//atributos
	private String nome;
	private String cpf;
	private Date dataNasc;
	
	public Pessoa(String nome, String cpf, Date dataNasc) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNasc(dataNasc);
	}
	
	public double tirarCopias(int qtde) {
		double preco = 0.10;
		return preco * qtde;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getDataNasc()=" + getDataNasc()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
