import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int [][] valores = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0;j<N; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i=0; i<N; i++) {
			System.out.print(valores[i][i] + " ");			
			}
		System.out.println();
		
		int cont = 0;
		for(int i=0; i<N; i++) {
			for(int j=0;j<N; j++) {
					if(valores[i][j] < 0) {
						cont ++;
					}
				}
			}
		
		System.out.println("Quantidade de negativos = " + cont);
		
		sc.close();
	}

}
