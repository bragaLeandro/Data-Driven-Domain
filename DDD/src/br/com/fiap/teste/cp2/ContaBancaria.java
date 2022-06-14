package br.com.fiap.teste.cp2;

public class ContaBancaria {
	
	private int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void estadoAtual() {
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Dono da conta: " + this.getDono());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Status da conta: " + this.isStatus());
	}
	
	public void abrirConta(String t) {
		this.setStatus(true);
		this.setTipo(t);
		
		if(t.equals("cc")) {
			this.setSaldo(50);
		} else if(t.equals("cp")) {
			this.setSaldo(150);
		} else {
			System.out.println("Formato de conta inválida, não foi possível criar a conta");
			this.setStatus(false);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Não foi possível encerrar a conta, saldo positivo: " + this.getSaldo());
		} else if(this.getSaldo() < 0) {
			System.out.println("Não foi possível encerrar a conta, saldo negativo: " + this.getSaldo());
		} else {
			System.out.println("Conta encerrada com sucesso!");
			this.setStatus(false);
		}
	}
	
	public void depositar(double v) {
		if(this.isStatus()) {
			this.saldo+= v;
		} else {
			System.out.println("Não foi possível realizar o depósito");
			System.out.println("Motivo: " + (this.isStatus()? "Conta Aberta" : "Conta Fechada"));
		}
	}

	public void sacar(double v) {
		if(this.isStatus()) {
			if(this.getSaldo() >= v) {
				this.saldo-= v;
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Saldo INSUFICIENTE - Não foi possível realizar o saque!");
			}
		} else {
			System.out.println("Conta INATIVA - Não foi possível realizar o saque!");
		}
	}
	
	public void pagarMensalidade() {
		if(this.isStatus()) {
			if(this.getTipo().equals("cc")) {
				this.saldo -= 12;
			} else if(this.getTipo().equals("cp")) {
				this.saldo -= 20;
			}
		}
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
