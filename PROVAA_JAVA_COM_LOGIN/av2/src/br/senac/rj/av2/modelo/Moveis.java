package br.senac.rj.av2.modelo;

public class Moveis {
	private String tipo;
	private String nome;
	private double valor;
	private double desconto;

	public Moveis() {
	}

	public Moveis(String tipo, String nome, double valor) {
		this.tipo = tipo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public void calcularPercentual(double percentual) {
		this.desconto = this.valor * percentual;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
