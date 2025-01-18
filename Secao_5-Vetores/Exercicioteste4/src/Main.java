import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];

		for (int index=0; index<N; index+=1) {
			nomes[index] = sc.next();
			idades[index] = sc.nextInt();
			alturas[index] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int index=0; index<N; index+=1) {
			soma += alturas[index];			
		}
		
		double alturaMedia = soma / N;
		
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		int contadorIdades = 0;
		
		for (int index=0; index<N; index+=1) {
			if(idades[index] < 16) {
				contadorIdades += 1;
			}
		}
		
		double x = contadorIdades * 100.0 / N;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);

		sc.close();
	}

}
