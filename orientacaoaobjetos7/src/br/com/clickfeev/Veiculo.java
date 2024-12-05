package br.com.clickfeev;

public class Veiculo {
	public String marca;
	public int modelo;
	public int ano;
	private double preco;
	
	public Veiculo() { //construtor padrão
		
	}
	
	public Veiculo(String marca, int modelo, int ano, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	public void exibirDetalhesVeiculo() {
		System.out.println("============ DETALHES DO VEÍCULO ============");
		
		System.out.println("Marca:" + this.marca);
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Ano:" + this.ano);
		System.out.println("Preço:" + this.preco);
		
	}	
		
}
