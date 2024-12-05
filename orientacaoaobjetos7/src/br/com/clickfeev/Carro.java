package br.com.clickfeev;

public class Carro extends Veiculo {
	public int qtdePortas;
	public double desconto;
	public double percentual;
	
	public Carro(int qtdePortas, String marca, int modelo, int ano, double preco, double percentual) {
		super( marca, modelo, ano, preco);
		this.qtdePortas = qtdePortas;
		this.percentual = percentual;
	}
	
	public void calcularDesconto() {
		this.desconto = (this.getPreco() * this.percentual) / 100;
		
	}
	
	public void exibirDetalhesVeiculo() {
		System.out.println("============ DETALHES DO CARRO ============");
		
		System.out.println("Marca:" + this.marca);
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Ano:" + this.ano);
		System.out.println("Preço:" + this.getPreco());
		System.out.println("Portas:" + this.qtdePortas);
		System.out.println("Desconto:" + this.desconto);

	}
}
