
public class TesteOperadorTernario1 {

	public static void main(String[] args) {
		
//		 Verificação de idade para definir se é maior de idade:
		int idade = 16;
		System.out.println("idade = " +  idade);
		System.out.println(idade>=18 ? "Adulto" : "Não é adulto");
		boolean votante;
		votante = (idade>=16) ? true : false;
		System.out.println(votante ? "Pode votar" : "Não pode votar");
		
		
//		Atribuição de valores numéricos com base em condições:
		int a = 5;
		int b = 10;
		int maior = (a > b) ? a : b;
		System.out.println( "O maior valor é: " + maior);
		System.out.println( "Valor de a é: " + a );
		System.out.println( "Valor de b é: " + b );
	}
	
	


}
