package br.senac.rj.teste;

public class Conta {

		private int agencia;
		private int numero;
		private String titular;
		private double saldo;
		
		Conta (){
			this.titular = "";
		}
		
		Conta (int numAgencia, int numConta){
			this.agencia = numAgencia;
			this.numero = numConta;
		}
		
		
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
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
		public void deposita(double valor) {
			this.saldo = this.saldo + valor;
		}
		
		public boolean saca(double valor) {
			double novoSaldo = this.saldo - valor;
			if (novoSaldo < 0)
				return false;
			this.saldo = novoSaldo;
			return true;
		}
		
}
