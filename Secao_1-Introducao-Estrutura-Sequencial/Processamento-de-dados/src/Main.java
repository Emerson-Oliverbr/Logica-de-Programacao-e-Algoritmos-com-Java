public class Main {

	public static void main(String[] args) {
		int x, y;
		x = 5;
		y = 2 * x;
		
		int z;
		double s;
		
		z = 5;
		s = 2 * z;
		
		System.out.println(x);
		System.out.println(y + "\n");		
		System.out.println(z);
		System.out.println(s + "\n");
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area + "\n");
		
		//casting
		
		int n1, n2;
		double resultado;
		
		n1 = 5;
		n2 = 2;
		
		resultado = (double) n1 / n2;
		
		
		System.out.println(resultado + "\n");
		
		//casting segundo exemplo
		
		double n3;
		int n4;		
		
		n3 = 5.0;
		n4 = (int) n3;	
		
		System.out.println(n4);
	}

}
