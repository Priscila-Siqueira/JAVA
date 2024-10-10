package br.com.estudos.subclasses;

import br.com.estudos.animal.Animal;

public class Cachorro extends Animal {

	@Override
	public void fazerSom() {
		System.out.println("O cachorro late.");
	}
	
}
