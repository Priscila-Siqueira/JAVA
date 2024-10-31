package br.senac.rj.empresa.teste;

import java.util.Scanner;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {
		// OBS: toma cuidado com os espaços quando foi digitar no console.
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		Scanner scanner = new Scanner(System.in);
		
		String resposta; // variavel global 
		
		do {
			System.out.print("Entre com o registro:");
			funcionario.registro = Integer.parseInt(scanner.nextLine());
			
			System.out.print("Entre com o nome:");
			funcionario.nome = scanner.nextLine();
			
			System.out.print("Entre com o código do cargo:");
			funcionario.cargo = Integer.parseInt(scanner.nextLine());
			
			System.out.print("Entre com o salário:");
			funcionario.salario = Double.parseDouble(scanner.nextLine());
			
			System.out.println("Salário = " + funcionario.salario);
			funcionario.aplicarBonificacao();
			
			System.out.println("O novo salário de " + funcionario.nome + " é " + funcionario.salario);
			
			do {
				System.out.print("Deseja continuar (s/n)?");
				resposta = scanner.nextLine().toUpperCase();
				
				if (!resposta.equals("S") && !resposta.equals("N")) { //equals é igual a =
					System.out.println("Opção incorreta!");
				}
				
			} while (!resposta.equals("S") && !resposta.equals("N"));
			
			
		} while (resposta.equals("S")); //se for verdade o while entra e volta para o do 
		scanner.close();
	}
}
