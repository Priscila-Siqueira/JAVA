
public class ImpostoDeRenda {

	public static void main(String[] args) {
		double salarioFuncionario = 4000.00;
		
		if (salarioFuncionario <= 2826.66) {
			System.out.println("Funcionário Insento ao Imposto de Renda");
			
		} else if (salarioFuncionario >= 2826.66 && salarioFuncionario <= 3751.05) {
			double impostoRenda = (salarioFuncionario * 0.15) - 354.80;
			System.out.println("O imposto de renda à pagar é de:" + impostoRenda);
			
		} else if (salarioFuncionario >= 3751.05 && salarioFuncionario <= 4664.68) {
			double impostoRenda = (salarioFuncionario * 0.22) - 636.13;
			System.out.println("O imposto de renda à pagar é de:" + impostoRenda);
		} else {
			double impostoRenda = (salarioFuncionario * 0.27) - 869.36;
			System.out.println("O imposto de renda à pagar é de:" + impostoRenda);
		}
	}

}


		