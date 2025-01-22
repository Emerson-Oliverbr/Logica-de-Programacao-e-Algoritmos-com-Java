import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int valores[][] = new int[M][N];		
		int valores2[][] = new int[M][N];
		int valores3[][] = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				valores2[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				valores3[i][j] = valores[i][j] + valores2[i][j];
			}
		}
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(valores3[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
