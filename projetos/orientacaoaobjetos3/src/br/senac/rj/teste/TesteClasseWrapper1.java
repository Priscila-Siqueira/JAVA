package br.senac.rj.teste;

public class TesteClasseWrapper1 {

	public static void main(String[] args) {
		// Unboxing
		boolean a = Boolean.parseBoolean("true");
		byte b = Byte.parseByte("2");
		short c = Short.parseShort("10");
		int d = Integer.parseInt("20");
		long e = Long.parseLong("30");
		float f = Float.parseFloat("40.5");
		double g = Double.parseDouble("50.6");
		// Autoboxing
		Integer h = 800; 
		// Exibição de valores
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g);
		System.out.println("largura de h ="+h.toString().length());
	}
}
