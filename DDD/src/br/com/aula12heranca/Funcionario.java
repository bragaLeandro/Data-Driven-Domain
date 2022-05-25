package br.com.aula12heranca;

import java.util.Date;

public class Funcionario extends Pessoa{
	
	private double salario;
	private Date dataAdmissao;
	private String cargo;
	
	public Funcionario(String nome, String cpf, Date dataNasc, double salario, Date dataAdmissao, String cargo) {
		super(nome, cpf, dataNasc);
		this.setSalario(salario);
		this.setDataAdmissao(dataAdmissao);
		this.setCargo(cargo);
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
