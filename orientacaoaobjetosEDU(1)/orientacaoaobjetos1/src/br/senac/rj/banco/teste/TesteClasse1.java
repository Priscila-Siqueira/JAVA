package br.senac.rj.banco.teste;

import java.util.Scanner;

import br.senac.rj.banco.modelo.Conta;

public class TesteClasse1 {
	public static void main(String[] args) {
//		Conta conta1 = new Conta();
//		conta1.agencia = 1;
//		conta1.numero = 100;
//		conta1.saldo = 200;
//		System.out.println("Saldo inicial =" + conta1.saldo);
//		int valorDeposito = 10;
//		conta1.depositar(valorDeposito);
//		System.out.println("Valor do depósito = " + valorDeposito);
//		System.out.println("Saldo após o depósito = " + conta1.saldo);
		Scanner input = new Scanner(System.in);

		
		// Coleta de inputs do usuário
		System.out.println("Informe um nº de Agência");
		int n_agencia = input.nextInt();
		
		System.out.println("Informe um nº de Conta");		
		int n_numero = input.nextInt();
		
		System.out.println("Informe um Saldo inicial");
		double n_saldo = input.nextDouble();
		
		//Instanciando a classe utilizando os inputs do usuário
		Conta conta1 = new Conta(n_agencia,n_numero,n_saldo);
		
//		System.out.println(conta1.getAgencia()); 
//		System.out.println(conta1.getNumero());
//		System.out.println(conta1.getSaldo());
		
//		System.out.println("Saldo inicial =" + conta1.getSaldo());
//		double valorDeposito = 10;
//		conta1.depositar(valorDeposito);;
//		System.out.println("Valor do depósito = " + valorDeposito);
//		System.out.println("Saldo após o depósito = " + conta1.getSaldo());
		
		// EXERCÍCIO SLIDE 154 
//		Scanner input = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("Escolha uma operação:\n1 - Consultar\n2 - Depositar\n3 - Sacar\n4 - Encerrar");
			option = input.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Informações da conta:");
				System.out.println("Agência:");
				System.out.println(conta1.getAgencia());
				System.out.println("Numero:");
				System.out.println(conta1.getNumero());
				System.out.println("Saldo:");
				System.out.println(conta1.getSaldo());
				break;
			case 2:
				System.out.println("Digite o valor a ser depositado:");
				conta1.depositar(input.nextDouble());
				System.out.println("Saldo da conta após depósito: "+ conta1.getSaldo());
				break;
			case 3:
				System.out.println("Informe um valor para sacar: ");
				double valorSaque = input.nextDouble();
				if (conta1.sacar(valorSaque)) {
					System.out.println("Saldo após o saque = " + conta1.getSaldo());
				}else {
					System.out.println("Não foi possível efetuar o saque");}
				break;
			case 4:
				System.out.println("Encerrando aplicação, obrigado!");
				break;
			default:
					System.out.println("Opção Inválida!");
				break;
			}
			
			
			
		} while (option != 4);
//		System.out.println("Informe um valor para sacar: ");
//		
//		double valorSaque = input.nextDouble();
////		int valorSaque = 10000;
//		System.out.println("Valor do saque = " + valorSaque);
//		if (conta1.sacar(valorSaque)) {
//			System.out.println("Saldo após o saque = " + conta1.getSaldo());
//		}else {
//			System.out.println("Não foi possível efetuar o saque");
		}
	}


