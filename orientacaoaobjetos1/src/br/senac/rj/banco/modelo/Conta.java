package br.senac.rj.banco.modelo;

public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta(int n_agencia, int n_numero, double n_saldo ) {
		agencia = n_agencia;
		numero = n_numero;
		saldo = n_saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(double valor) {
		double novoSaldo = saldo - valor;
		if (novoSaldo < 0)
			return false;
		saldo = novoSaldo;
		return true;
	}
	
}
