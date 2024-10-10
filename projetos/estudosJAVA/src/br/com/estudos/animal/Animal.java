package br.com.estudos.animal;

public abstract class Animal {
    public abstract void fazerSom(); // Método abstrato

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}