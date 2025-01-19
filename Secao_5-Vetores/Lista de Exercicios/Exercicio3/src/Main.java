import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int valoresA[] = new int [N];
		int valoresB[] = new int [N];
		
		for(int index=0; index<N; index+=1) {
			valoresA[index] = sc.nextInt();
		}
		
		for(int index=0; index<N; index+=1) {
			valoresB[index] = sc.nextInt();
		}
		
		int[] valoresC = new int [N];
		for(int index=0; index<N; index+=1) {
			valoresC[index] = valoresA[index] + valoresB[index];
		}
		
		sc.close();
	}

}
