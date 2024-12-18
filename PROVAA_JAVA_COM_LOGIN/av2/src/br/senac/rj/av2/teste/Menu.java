package br.senac.rj.av2.teste;


import java.util.Scanner;

import br.senac.rj.av2.modelo.Mesa;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		int opcaoLogin = 0;
		
		Mesa mesa01 = null;
		
		do {
			System.out.println("Digite o seu email:");
			String email = sc.nextLine();
			
			System.out.println("Digite sua senha:");
			String senha = sc.nextLine();
			
			if(email.equalsIgnoreCase("priscila.faculdade@gmail")  && senha.equalsIgnoreCase("123456")) {
				
				do {
					System.out.println("====== MENU ======= \n\n"
							+ "1 – Cadastrar os atributos da subclasse \n"
							+ "2 – Aplicar percentual a ser definido \n"
							+ "3 – Aplicar percentual fixo de 10% \n"
							+ "4 – Exibir os atributos da subclasse \n"
							+ "5 – Encerrar o programa \n\n"
							+ "Escolha uma opção:"
							);
					
					opcao = Integer.parseInt(sc.nextLine());
					
					switch (opcao) {
					
						case 1:{
							System.out.println("Digite o tipo da mesa:");
							String tipo = sc.nextLine();
							
							System.out.println("Digite o nome da marca:");
							String nome = sc.nextLine();
							
							System.out.println("Digite o valor da mesa:");
							double valor = Double.parseDouble(sc.nextLine());
							
							mesa01 = new Mesa(tipo, nome, valor);
							
							break;
						}
						
						case 2:{
							System.out.println("Digite o percentual que deseja dar nesse produto:");
							double percentual = Double.parseDouble(sc.nextLine());
							
							mesa01.calcularPercentual(percentual);
							break;
						}
						case 3:{
							mesa01.calcularPercentual();
							
							break;
						}
						case 4:{
							
							System.out.println("========= MESA =========");
							System.out.println("Tipo: " + mesa01.getTipo());
							System.out.println("Nome: " + mesa01.getNome());
							System.out.println("Valor: " + mesa01.getValor());
							System.out.println("Desconto: " + mesa01.getDesconto());
							System.out.println("===========================");
							
							break;
						}
						case 5:{
							System.out.println("Programa encerrado!!!!");
							break;
							
						}
						default:
							System.out.println("Digite uma opção de 1 ao 5!");
					}
				
					
				} while (opcao != 5);
				
			} else {
				System.out.println("Dados incorretos \n\n"
						+ "Deseja tentar novamente? \n"
						+ "0 - Para sair \n1 - Para tentar novamente");
				opcaoLogin = Integer.parseInt(sc.nextLine());
			}
			

		} while (opcaoLogin != 0);
		
		sc.close();
	}

}
