package br.com.senac;

public class Funcionario {
	public int registro;
	public String nome;
	public int cargo;
	public double salario;
	private double bonificacao;
	
	public Funcionario() { //construtor padrão
		
	}
	
	public Funcionario(int registro, String nome, int cargo, double salario) { // construtor para analista sem bonificao
		this.registro = registro;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Funcionario(int registro, String nome, int cargo, double salario, double bonificacao) { // construtor para gerente com bonificao
		this.registro = registro;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.bonificacao = bonificacao;
	}

	public double getBonificacao() {
		return bonificacao;
	}
	
	public void aplicarBonificacao() {
		double bonificacao;
		switch (this.cargo) {
			case 1:
				bonificacao = this.salario * 0.2;
				break;
			case 2:
				bonificacao = this.salario * 0.4;
				break;
			case 3:
				bonificacao = this.salario * 0.6;
				break;
			default:
				bonificacao = 0;
			break;
		}
		this.salario = this.salario + bonificacao;
	}
}
