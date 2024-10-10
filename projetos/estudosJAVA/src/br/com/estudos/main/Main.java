package br.com.estudos.main;

import br.com.estudos.subclasses.*;

public class Main {
	
	public static void main(String[] args) {

	
		Cachorro meuCachorro = new Cachorro(); // Instanciando a subclasse
	    meuCachorro.fazerSom(); // Saída: O cachorro late.
	        
	    Gato meuGato = new Gato();
	    meuGato.fazerSom();
	        
		}     
}
