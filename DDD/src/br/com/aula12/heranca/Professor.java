package br.com.aula12.heranca;

import java.util.Date;

public class Professor extends Pessoa {
	//atributos
	private double salario;
	private String disciplina;
	
	public Professor(String nome, String cpf, Date dataNasc, double salario, String disciplina) {
		super(nome, cpf, dataNasc);
		this.setSalario(salario);
		this.setDisciplina(disciplina);
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
