package br.senac.rj.empresa.teste;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.registro = 1;
		func1.nome = "Zezinho";
		func1.cargo = 1;
		func1.salario = 10000;
		System.out.println("Salário = " + func1.salario);
		func1.aplicarBonificacao();
		System.out.println("O novo salário de " + func1.nome + " é " + func1.salario);
	}
}
