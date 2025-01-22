import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] numeros = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				numeros[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS");
		
		int numerosNegativos = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (numeros[i][j] < 0) {					
					numerosNegativos = numeros[i][j];	
					System.out.println(numeros[i][j] + " ");
				}
			}			
		}
		
		
		
		sc.close();
	}

}
