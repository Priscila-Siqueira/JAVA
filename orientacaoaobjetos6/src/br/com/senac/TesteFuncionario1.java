package br.com.senac;

import java.util.Scanner;


public class TesteFuncionario1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta;
		
		int registro;
		String nome;
		int cargo;
		double salario;
		int eGerente;
		
		do {
			System.out.print("Entre com o registro:");
			registro = Integer.parseInt(sc.nextLine());
			
			System.out.print("Entre com o nome:");
			nome = sc.nextLine();
			
			System.out.print("Entre com o código do cargo:");
			cargo = Integer.parseInt(sc.nextLine());
			
			System.out.print("Entre com o salário:");
			salario = Double.parseDouble(sc.nextLine());
			
			System.out.print("Você é gerente (1 - sim / 0 - nao)? ");
			eGerente = Integer.parseInt(sc.nextLine());
			
			if (eGerente == 1) {
				System.out.print("Informe a porcentagem da bonificação: ");
                double bonificacao = Double.parseDouble(sc.nextLine());
           
				Gerente gerente01 = new Gerente(registro, nome, cargo, salario, bonificacao);
				gerente01.aplicarBonificacao();
				System.out.println("O novo salário do gerente " + nome + " é " + gerente01.salario);
				
			} else {
				Analista analista01 = new Analista(registro, nome, cargo, salario);
                analista01.aplicarBonificacao();
                System.out.println("O novo salário do analista " + nome + " é " + analista01.salario);
			}

			System.out.println("O novo salário de " + nome + " é " + salario);
			
			do {
				
				System.out.print("\n Deseja continuar (sim/não)?");
				resposta = sc.nextLine().toUpperCase(); //toUpperCase todas as letras se tornam maiúsculas
				
				if (!resposta.equals("SIM") && !resposta.equals("NÃO")) { // equaLs é a mesma coisa que igual
					System.out.println("Opção incorreta!");
				}
				
			} while (!resposta.equals("SIM")&&!resposta.equals("NÃO"));
		
		} while (resposta.equals("SIM"));
		
		sc.close();
	}
}
