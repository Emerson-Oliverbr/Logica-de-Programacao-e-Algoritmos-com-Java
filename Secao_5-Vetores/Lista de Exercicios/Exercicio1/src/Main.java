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
		
		double maiorValor = valores[0];
		int posicaoDoMaior = 0;
		
		
		for(int index=0; index<N; index +=1) {
			if(valores[index] > maiorValor) {
				maiorValor = valores[index];
				posicaoDoMaior = index;
			}
		}
		
		System.out.printf("%.2f%n", maiorValor);
		System.out.println(posicaoDoMaior);
		
		sc.close();
	}

}
