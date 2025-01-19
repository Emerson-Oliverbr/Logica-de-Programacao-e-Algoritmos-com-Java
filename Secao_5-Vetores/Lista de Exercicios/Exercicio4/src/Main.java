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
		
		double media = 0.0;
		for(int index=0; index<N; index+=1) {
			media += valores[index] / N;			
		}
		
		System.out.printf("%.3f%n", media);
		
		double[] valoresAbaixoDaMedia = new double[N]; 
		for(int index=0; index<N; index+=1) {
			if(valores[index] < media) {
				valoresAbaixoDaMedia[index] += valores[index];
				System.out.printf("%.1f%n", valores[index]);
			}
		}
		
		sc.close();
	}

}
