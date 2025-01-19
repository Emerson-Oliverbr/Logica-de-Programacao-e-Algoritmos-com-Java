import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int valores[] = new int[N];
		
		for(int index=0; index<N; index+=1) {
			valores[index] = sc.nextInt();
		}		
		
		for(int index=0; index<N; index+=1) {
			if(valores[index] % 2 == 0) {
				System.out.print(valores[index] + " ");
			}
		}
		
		System.out.println();
		
		int quantidadeDePares = 0;
		for(int index=0; index<N; index+=1) {
			if(valores[index] % 2 == 0) {
				quantidadeDePares +=1;
			}
		}		
		
		System.out.println(quantidadeDePares);
		sc.close();
	}

}
