import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		int distanciaPercorrida = sc.nextInt();
		double combustivelGasto = sc.nextDouble();
		
		double consumoMedio = (distanciaPercorrida/combustivelGasto);
		
		System.out.printf("%.3f km/l", consumoMedio);
		sc.close();
	}

}
