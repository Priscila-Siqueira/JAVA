package br.com.senac;

public class Gerente extends Funcionario{
	
	public Gerente(int registro, String nome, int cargo, double salario, double bonificacao) {
		super(registro, nome, cargo, salario, bonificacao);
	}

	@Override
	public void aplicarBonificacao() {
		double valor = this.salario * this.getBonificacao();
		System.out.println("Bonificação aplicada ao gerente: " + valor);
		this.salario = this.salario + valor;
	}
}
