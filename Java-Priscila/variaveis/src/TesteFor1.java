import java.util.Iterator;

public class TesteFor1 {

	public static void main(String[] args) {
		//     INICIO | MEIO | FIM
		for (int x = 0; x <= 3; x++) {
		    System.out.println("x = " + x);
		}
		
		System.out.println(" ");
		
		int y;
		for (y = 3; y >= 0; y--) {
		    System.out.println("y = " + y);
		}
		System.out.println("Valor final de y = " + y);
	}
}