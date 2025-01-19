import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		float[] notasA = new float[N];
		float[] notasB = new float[N];
		
		for(int index=0; index<N; index+=1) {
			nomes[index] = sc.next();
			notasA[index] = sc.nextFloat();
			notasB[index] = sc.nextFloat();
		}
		
		System.out.println("Alunos aprovados: ");
		for(int index=0; index<N; index+=1) {
			double media = (notasA[index] + notasB[index]) / 2.0;
			if(media >= 6.0 ) {
				System.out.println(nomes[index]);
			}
		}
		
		sc.close();
	}

}
