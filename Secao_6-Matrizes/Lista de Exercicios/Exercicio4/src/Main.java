import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] valores = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) { 
				soma += valores[i][j];
				}			
			}
		System.out.println(soma + " ");
		
		sc.close();
	}

}
