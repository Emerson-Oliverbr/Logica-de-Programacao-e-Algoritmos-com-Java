import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] alturas = new double[N];
		char[] sexos = new char[N];

		for (int index=0; index<N; index+=1) {
			alturas[index] = sc.nextDouble();
			sexos[index] = sc.next().charAt(0);
		}
		
		double menorAltura = alturas[0];
		for (int index=1; index<N; index+=1) {
			if (alturas[index] < menorAltura) {
				menorAltura = alturas[index];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		
		double maiorAltura = alturas[0];
		for (int index=1; index<N; index+=1) {
			if (alturas[index] > maiorAltura) {
				maiorAltura = alturas[index];
			}
		}
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		double somaDasAlturasDasMulheres = 0.0;
		int contMulheres = 0;
		for (int index = 0; index <N; index+=1) {
			if (sexos[index] == 'F') {
				somaDasAlturasDasMulheres = somaDasAlturasDasMulheres + alturas[index];
				contMulheres++;
			}
		}

		if (contMulheres == 0) {
			System.out.println("Nao ha nenhuma mulher dentre as pessoas");
		} else {
			double media = somaDasAlturasDasMulheres / contMulheres;
			System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		}

		
		int contHomens = 0;
		for (int index=0; index<N; index+=1) {
			if (sexos[index] == 'M') {
				contHomens++;
			}
		}
		System.out.println("Numero de homens = " + contHomens);

		sc.close();
	}
}