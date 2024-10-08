package br.senac.rj.banco.teste;

import br.senac.rj.banco.modelo.Conta;

public class TesteClasse1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setAgencia (1);
        conta1.setNumero (100);
        conta1.deposita (200);
        System.out.println("Saldo inicial = " + conta1.getSaldo());
        int valorDeposito = 10;
        conta1.deposita(valorDeposito);
        System.out.println("Valor do depósito = " + valorDeposito);
        System.out.println("Saldo após o depósito = " +  conta1.getSaldo());
        int valorSaque = 200;
        System.out.println("Valor do saque = " + valorSaque);
        if (conta1.saca(valorSaque))
            System.out.println("Saldo após o saque = " +  conta1.getSaldo());
        else
            System.out.println("Não foi possível efetuar o saque");
    }
}