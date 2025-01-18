import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sapos = 0, ratos = 0, coelhos = 0; 
		
		for(int index=1; index<=N; index+=1) {
			int quantidadeCobaias = sc.nextInt();
			char tipoCobaia = sc.next().charAt(0);
			
			if(tipoCobaia == 's' || tipoCobaia == 'S') {
				sapos += quantidadeCobaias;
			}
			else if (tipoCobaia == 'r' || tipoCobaia == 'R') {
				ratos += quantidadeCobaias;
			}
			else {
				coelhos += quantidadeCobaias;
			}
		}
		
		double totalCobaias = coelhos + sapos + ratos;
		double percentualCoelhos = 0.0, percentualRatos = 0.0, percentualSapos = 0.0;
		
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		
		percentualCoelhos = (coelhos / totalCobaias) * 100.0;
		percentualRatos = (ratos / totalCobaias) * 100.0;
		percentualSapos = (sapos / totalCobaias) * 100.0;
		
		System.out.printf("Percentual de coelhos: %.2f%%%n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f%%%n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f%%%n", percentualSapos);
		
		sc.close();
	}

}
