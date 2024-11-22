package br.senac.rj.teste;

public class TesteConstrutor1 {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		System.out.println("Titular = " + conta1.getTitular());
		
		Conta conta2 = new Conta(33, 101);
		System.out.println("Novo Titular = " + conta2.getTitular());
		System.out.println("Agência = " + conta2.getAgencia());
		System.out.println("Número da conta = " + conta2.getNumero());

	}

}
