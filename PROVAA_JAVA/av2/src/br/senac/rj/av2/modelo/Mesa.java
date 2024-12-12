package br.senac.rj.av2.modelo;

public class Mesa extends Moveis {

	//private String dataNascimento;
	
	public Mesa(String tipo, String nome, Double valor) {
		super(tipo, nome, valor); // valores indo para classe mãe
		
		//this.dataNascimento = dataNascimento; // valores do filho
	}
	
	public void calcularPercentual() {
		double valorCalculo = getValor() * 0.1;
		this.setDesconto(valorCalculo);
	}
	
}
