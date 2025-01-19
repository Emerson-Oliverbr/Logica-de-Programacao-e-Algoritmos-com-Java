import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int index=0; index<N; index+=1) {
			vet[index] = sc.nextDouble();
		}

		double somaDosPares = 0.0;
		int quantidadeDePares = 0;
		for (int index=0; index<N; index+=1) {
			if (vet[index] % 2 == 0) {
				somaDosPares = somaDosPares + vet[index];
				quantidadeDePares+=1;
			}
		}

		if (quantidadeDePares == 0) {
			System.out.println("Nao havia nenhum numero par");
		}
		else {
			double media = somaDosPares / quantidadeDePares;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}
}