package br.com.clickfeev;

import java.util.Scanner;


public class TesteVeiculo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta;
		
		String marca;
		int modelo;
		int ano;
		double preco;
		int eCarro;
		
		do {
			System.out.print("Entre a marca:");
			marca = sc.nextLine();
			
			System.out.print("Entre com o modelo");
			modelo = Integer.parseInt(sc.nextLine());
			
			System.out.print("Entre com o ano:");
			ano = Integer.parseInt(sc.nextLine());
			
			System.out.print("Entre com o preco:");
			preco = Double.parseDouble(sc.nextLine());
			
			System.out.print("Deseja cadastrar um carro? (1 - sim / 0 - nao)? ");
			eCarro = Integer.parseInt(sc.nextLine());
			
			if (eCarro == 1) {
				System.out.print("Informe a quantidade de portas do seu carro?");
				int qtdePortas = Integer.parseInt(sc.nextLine());
				
				System.out.print("Informe a porcentagem do desconto: ");
                double percentual = Double.parseDouble(sc.nextLine());
           
				Carro carro01 = new Carro(qtdePortas, marca, modelo, ano, preco, percentual);
				carro01.calcularDesconto();
				carro01.exibirDetalhesVeiculo();
				System.out.println("O desconto da " + marca + " é " + carro01.desconto);
				
			} else {
				System.out.print("Informe a sua idade?");
				int idade = Integer.parseInt(sc.nextLine());
				
				System.out.print("Informe a cilindrada?");
				int cilindrada = Integer.parseInt(sc.nextLine());
				
			
				Moto moto01 = new Moto (marca, modelo, ano,  preco, cilindrada, idade);
				moto01.calcularSeguro();
				moto01.exibirDetalhesVeiculo();	
			}
		
			
			do {
				
				System.out.print("\n Deseja continuar (s/n)?");
				resposta = sc.nextLine().toUpperCase(); //toUpperCase todas as letras se tornam maiúsculas
				
				if (!resposta.equals("S") && !resposta.equals("N")) { // equaLs é a mesma coisa que igual
					System.out.println("Opção incorreta!");
				}
				
			} while (!resposta.equals("S") && !resposta.equals("N"));
		
		} while (resposta.equals("S"));
		
		sc.close();
	}
}
