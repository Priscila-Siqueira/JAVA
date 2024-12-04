package br.senac.rj.teste;

public abstract class Conta {

		private int agencia;
		private int numero;
		private String titular;
		protected double saldo;
		
		public static int totalConta;
		
		Conta (){  //construtor padrão
			this.titular = "";
			System.out.println("Construtor da classe conta ");
			Conta.totalConta++;
		}
		
		Conta (int numAgencia, int numConta){ // construtor não padrão
			this(); //se refere ao construtor padrão
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
		
		public abstract boolean saca(double valor);
//	double novoSaldo = this.saldo - valor;
//	if (novoSaldo < 0)
//				return false;
//			this.saldo = novoSaldo;
//			return true;
//		}
		
 }
