import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x, nome;
		int y, idade;
		double z, altura;
		char genero;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		genero = sc.next().charAt(0);
		nome = sc.next();
		idade = sc.nextInt();
		altura = sc.nextDouble();
		
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou: " + y);
		System.out.println("Voce digitou: " + z);
		System.out.printf("Voce digitou: %.2f\n" , z);
		System.out.println("Voce digitou: " + genero);
		System.out.println("Dados da Pessoa: ");
		System.out.println(nome);
		System.out.println(idade);
		System.out.printf("%.2f\n", altura);
		
		sc.close();
	}

}
