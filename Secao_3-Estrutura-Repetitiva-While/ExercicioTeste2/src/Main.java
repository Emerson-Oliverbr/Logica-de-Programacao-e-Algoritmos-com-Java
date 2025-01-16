import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int idade = scanner.nextInt();

		double somaIdades = 0.0;
		int contadorIdades = 0;

		if (idade < 0) {
			System.out.println("Impossivel calcular");
		} 
		
		else {
			while (idade > 0) {
				contadorIdades += 1;
				somaIdades += idade;
				idade = scanner.nextInt();
			}

			double idadeMedia = somaIdades / contadorIdades;
			System.out.printf("%.2f", idadeMedia);
		}

		scanner.close();
	}

}
