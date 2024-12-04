package br.com.senac;

public class Gerente extends Funcionario{
	
	public Gerente(int registro, String nome, int cargo, double salario) {
		super(registro, nome, cargo, salario);
	}

	@Override
	public void aplicarBonificacao() {
		double bonificacao = this.salario * 0.1;
		setBonificacao(bonificacao);
		System.out.println("Bonificação aplicada ao gerente: " + bonificacao);
		this.salario = this.salario + bonificacao;
	}
}
