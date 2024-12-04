package br.senac.rj.empresa.teste;

import java.util.Scanner;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		
		Scanner sc = new Scanner(System.in);
		
		String resposta;
		do {
			System.out.print("Entre com o registro:");
			func1.registro = Integer.parseInt(sc.nextLine());
			
			System.out.print("Entre com o nome:");
			func1.nome = sc.nextLine();
			
			System.out.print("Entre com o código do cargo:");
			func1.cargo = Integer.parseInt(sc.nextLine());
			
			System.out.print("Entre com o salário:");
			func1.salario = Double.parseDouble(sc.nextLine());
			
			System.out.println("Salário = " + func1.salario);
			func1.aplicarBonificacao();
			
			System.out.println("O novo salário de " + func1.nome + " é " + func1.salario);
			
			do {
				
				System.out.print("Deseja continuar (s/n)?");
				resposta = sc.nextLine().toUpperCase();
				
				if (!resposta.equals("S")&&!resposta.equals("N")) {
					System.out.println("Opção incorreta!");
				}
				
			} while (!resposta.equals("S")&&!resposta.equals("N"));
			
		} while (resposta.equals("S"));
		sc.close();
	}
}
