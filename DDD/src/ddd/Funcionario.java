package ddd;

public class Funcionario {
	//atributos
	private String nome;
	private String depto;
	private double salario;
	private String admissao;
	private String rg;
	
	//metodos getters e setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDepto() {
		return depto;
	}
	
	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getAdmissao() {
		return admissao;
	}
	
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	public String getRg() {
		return rg;
	}
	
	public void setRG(String rg) {
		this.rg = rg;
	}
	
	//metodo operacional
	public double aumentarSalario(double aumento) {
		double novoSalario = salario + (salario*(aumento/100));
		return novoSalario;
	}
}
