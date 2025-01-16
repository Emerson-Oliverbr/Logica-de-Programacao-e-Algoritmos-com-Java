import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int tempo, velocidade;
		double litros;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		
		litros = (double) tempo * velocidade / 12.0;
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}
