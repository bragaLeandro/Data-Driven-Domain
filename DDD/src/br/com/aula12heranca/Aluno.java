package br.com.aula12heranca;

import java.util.Date;

public class Aluno extends Pessoa{
	
	private String matricula;
	private String curso;
	private float mensalidade;
	
	public Aluno(String nome, String cpf, Date dataNasc, String matricula, String curso, float mensalidade) {
		super(nome, cpf, dataNasc);
		this.setMatricula(matricula);
		this.setCurso(curso);
		this.setMensalidade(mensalidade);
	}
	
	public double tirarCopias(int qtde) {
		double valor = 0.07;
		return valor * qtde;
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
}
