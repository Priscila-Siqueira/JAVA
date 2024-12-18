package br.senac.rj.empresa.modelo;

public class Funcionario {
	public int registro;
	public String nome;
	public int cargo;
	public double salario;
	
	public void aplicarBonificacao() {
		double bonificacao;
		switch (this.cargo) {
		case 1:
			bonificacao = this.salario * 0.2; // 0.2 = 20%
			break;
		case 2:
			bonificacao = this.salario * 0.4; // 0.4 = 40%
			break;
		case 3:
			bonificacao = this.salario * 0.6; // 0.6 = 60%
			break; // break sai do switch
		default:
			bonificacao = 0;
			break;
		}
		System.out.println("Bonificação = " + bonificacao);
		this.salario = this.salario + bonificacao;
	}
}
