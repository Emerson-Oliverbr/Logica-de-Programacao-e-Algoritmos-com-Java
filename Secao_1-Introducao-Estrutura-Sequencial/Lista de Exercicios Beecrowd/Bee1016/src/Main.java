import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		int diferencaVelocidade = 30;

		int tempo = (distancia * 60) / diferencaVelocidade;

		System.out.println(tempo + " minutos");

		sc.close();
	}

}
