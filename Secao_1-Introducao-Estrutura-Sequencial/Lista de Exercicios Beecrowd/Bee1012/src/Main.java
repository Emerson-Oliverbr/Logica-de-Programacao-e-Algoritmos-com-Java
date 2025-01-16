import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaDoTriangulo = A * C / 2.0;
		double areaDoCirculo = 3.14159 * C * C;
		double areaDoTrapezio = (A + B) / 2.0 * C;
		double areaDoQuadrado = B * B;
		double areaDoRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", areaDoTriangulo);
		System.out.printf("CIRCULO: %.3f\n", areaDoCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
		System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);
		
		sc.close();
	}

}
