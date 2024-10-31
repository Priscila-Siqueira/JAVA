package br.senac.rj.empresa.modelo;

public class Funcionario {
	public int registro;
	public String nome;
	public int cargo;
	public double salario;

	public void aplicarBonificacao() {
		double bonificacao;
		switch (cargo) {
		case 1:
			bonificacao = salario * 0.2;
			break;
		case 2:
			bonificacao = salario * 0.4;
			break;
		case 3:
			bonificacao = salario * 0.6;
			break;
		default:
			bonificacao = 0;
			break;
		}
		System.out.println("Bonificação = " + bonificacao);
		this.salario = this.salario + bonificacao;
	}
}
