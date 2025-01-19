import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];	
		int[] idades = new int[N];
		
		for(int index=0; index<N; index+=1) {
			nomes[index] = sc.next();
			idades[index] = sc.nextInt();
		}
		
		int maiorIdade = idades[0];
		int posicaoDaMaiorIdade = 0;
		for(int index=0; index<N; index+=1) {
			if(idades[index] > maiorIdade) {
				maiorIdade = idades[index];
				posicaoDaMaiorIdade = index;
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomes[posicaoDaMaiorIdade]);
		
		sc.close();
	}
}
