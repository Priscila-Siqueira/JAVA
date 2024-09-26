public class TesteConversaoVariaveis1 {

	public static void main(String[] args) {
		//Conversão implícita de tipo
		int a = 5;
		float b = 10.5f; //Precisa colocar a letra f no final para que seja considerado float e não double
		b = a; //Esta linha substitui o valor de b (que era 10.5f) pelo valor de a, que é 5.
			   // Como b é um float, o valor é convertido automaticamente de int para float sem perda de precisão, então b se torna 5.0.
		
		//Conversão explícita de tipo
		int c = (int) b; //Exemplo de Cast
		System.out.println("a="+a);
		System.out.println("b="+b);                                                                                                                                                                                                                      
		System.out.println("c="+c);
	}
 
}


