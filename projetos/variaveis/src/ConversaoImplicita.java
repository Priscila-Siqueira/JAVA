
public class ConversaoImplicita {

	public static void main(String[] args) {
	
		int i = 5;
		float j;
		j = i;
		System.out.println(i);
		
//		Daqui para baixo o valor de "i" vai ser 6, pois foi atribuido um novo valor
		i = 6;
		System.out.println(i);
		System.out.println(j);
		

	}

}
