import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] valores = new int[N];
		
		for(int index=0; index<N; index+=1) {
			valores[index] = sc.nextInt();
		}
		
		for(int index=0; index<N; index +=1) {
			if(valores[index] < 0) {
				System.out.println(valores[index]);
			}
		}
		
		sc.close();
	}

}
