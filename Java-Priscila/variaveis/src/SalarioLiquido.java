
public class SalarioLiquido {

	public static void main(String[] args) {
	double salarioFuncionario = 20000.00;
		
		if (salarioFuncionario <= 2826.66) {
			System.out.println(salarioFuncionario > 20000.00 ? "Salário de diretor": "Salário de funcionário normal");
			
		} else if (salarioFuncionario >= 2826.66 && salarioFuncionario <= 3751.05) {
			double impostoRenda = (salarioFuncionario * 0.15) - 354.80;
			double salarioLiquido = salarioFuncionario - impostoRenda;
			System.out.println(salarioLiquido > 20000.00 ? "Salário de diretor": "Salário de funcionário normal");
			
		} else if (salarioFuncionario >= 3751.05 && salarioFuncionario <= 4664.68) {
			double impostoRenda = (salarioFuncionario * 0.22) - 636.13;
			double salarioLiquido = salarioFuncionario - impostoRenda;
			System.out.println(salarioLiquido > 20000.00 ? "Salário de diretor": "Salário de funcionário normal");
		} else {
			double impostoRenda = (salarioFuncionario * 0.27) - 869.36;
			double salarioLiquido = salarioFuncionario - impostoRenda;
			System.out.println(salarioLiquido > 20000.00 ? "Salário de diretor": "Salário de funcionário normal");
		}
		
	
	}

}

//int idade = 16;
//System.out.println("idade = " +  idade);
//System.out.println(idade>=18 ? "Adulto" : "Não é adulto");
//boolean votante;
//votante = (idade>=16) ? true : false;
//System.out.println(votante ? "Pode votar" : "Não pode votar");
