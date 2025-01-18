import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] valores = new double[N];
		
		
		for(int index=0; index<N; index+=1) {			
			valores[index] = sc.nextDouble();
		}
		
		for(int index=0; index<N; index+=1) {
			System.out.print(valores[index] + " ");
		}
		System.out.println();
		
		double soma = 0.0;
		for(int index=0; index<N; index+=1) {
			soma += valores[index];			
		}
		
		System.out.printf("%.1f%n", soma);
		
		double media = soma / N;	
		for(int index=0; index<N; index+=1) {				
		}
		
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}

}
