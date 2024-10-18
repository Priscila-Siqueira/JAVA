package br.senac.rj.empresa.teste;

import br.senac.rj.empresa.modelo.Funcionario;
import java.util.Scanner;

public class TesteFuncionario1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario func1 = new Funcionario();

        // Solicitar e ler o registro do funcionário
        System.out.print("Digite o registro do funcionário: ");
        func1.registro = Integer.parseInt(sc.nextLine());

        // Solicitar e ler o nome do funcionário
        System.out.print("Digite o nome do funcionário: ");
        func1.nome = sc.nextLine();

        // Solicitar e ler o cargo do funcionário
        System.out.print("Digite o cargo do funcionário (número): ");
        func1.cargo = Integer.parseInt(sc.nextLine());

        // Solicitar e ler o salário do funcionário
        System.out.print("Digite o salário do funcionário: ");
        func1.salario = Double.parseDouble(sc.nextLine());

        // Imprimir o salário antes da bonificação
        System.out.println("Salário = " + func1.salario);

        // Aplicar a bonificação
        func1.aplicarBonificacao();

        // Imprimir o novo salário
        System.out.println("O novo salário de " + func1.nome + " é " + func1.salario);
        
        System.out.println("Deseja continuar? ");
		String Pergunta  = sc.nextLine();

        // Fechar o scanner
        sc.close();
        
        
    }
}



/*package br.senac.rj.empresa.modelo;

public class Funcionario {
public int registro;
public String nome;
public int cargo;
public double salario;

public void aplicarBonificacao() {
double bonificacao;
switch (this.cargo) {
case 1:
bonificacao = this.salario * 0.2;
break;
case 2:
bonificacao = this.salario * 0.4;
break;
case 3:
bonificacao = this.salario * 0.6;
break;
default:
bonificacao = 0;
break;
}
System.out.println("Bonificação = " + bonificacao);
this.salario = this.salario + bonificacao;
}
}*/





