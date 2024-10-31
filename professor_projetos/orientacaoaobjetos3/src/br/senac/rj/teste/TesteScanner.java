package br.senac.rj.teste;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com um nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Entre com a nota1: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Entre com a nota2: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("A média do aluno " + nome + " é " + media);
		scanner.close();


	}

}
