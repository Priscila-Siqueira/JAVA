package br.com.clickfeev;

public class Moto extends Veiculo {
	public int cilindradas;
	public int idade;
	public double seguro;
	
	
	
	public Moto(String marca, int modelo, int ano, double preco, int cilindradas, int idade) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.idade = idade;
	}
	
	public void calcularSeguro() {
		if (this.idade >= 18 && this.idade <= 30) {
			double valorSeguro = this.getPreco() * 0.10;
			this.seguro = valorSeguro;
		}else if (this.idade > 30){
			double valorSeguro = this.getPreco() * 0.5;
			this.seguro = valorSeguro;
		}
		
	}


	public void exibirDetalhesVeiculo() {
		System.out.println("============ DETALHES DA MOTO ============");
		
		System.out.println("Marca:" + this.marca);
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Ano:" + this.ano);
		System.out.println("Preço:" + this.getPreco());
		System.out.println("Cilindradas:" + this.cilindradas);
		System.out.println("Seguro:" + this.seguro);
		
	
	}
	
}
