package br.senac.rj.banco.teste;

import java.util.Scanner;

import br.senac.rj.banco.modelo.Conta;

public class TesteClasse1 {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("1 - Consultar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Encerrar");
			System.out.print("Entre com a opção: ");
			op = Integer.parseInt(sc.nextLine());
			switch (op) {
			case 1:
				System.out.println("Saldo da conta é "+conta1.getSaldo());
				break;
			case 2:
				System.out.print("Entre com o valor a depositar: ");
				double valorDepositar = Double.parseDouble(sc.nextLine());
				conta1.deposita(valorDepositar);
				break;
			case 3:
				System.out.print("Entre com o valor a sacar: ");
				double valorSacar = Double.parseDouble(sc.nextLine());
				if (conta1.saca(valorSacar))
					System.out.println("Saque realizado com sucesso!");
				else
					System.out.println("Saldo insuficiente!");
				break;
			case 4:
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (op != 4);
		sc.close();
	}
}
