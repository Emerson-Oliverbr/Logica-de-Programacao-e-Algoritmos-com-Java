import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int maior = sc.nextInt();
		int posicao = 1;
		
		for (int index = 2; index <= 5; index+= 1) {
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
				posicao = index;
			}
		}

		System.out.println("Maior: " + maior);
		System.out.println("Posição " + posicao);

		sc.close();
	}
}