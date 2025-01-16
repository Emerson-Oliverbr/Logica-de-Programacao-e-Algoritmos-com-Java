import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10f;
		
		if(media >= 7f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno Aprovado.");
		}
		else if (media < 5f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno Reprovado.");
		}
		
		
		else if (media >= 5.0f || media <= 6.9f) {
			System.out.println("Aluno em exame.");
			System.out.print("Nota do exame: ");
			float notaExame = sc.nextFloat();
			float mediaFinal = (notaExame + media) / 2.0f;
			
			if(mediaFinal >= 5.0f) {
				System.out.printf("Nota exame: %.1f\n", mediaFinal);
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.printf("Nota exame: %.1f\n", mediaFinal);
				System.out.println("Aluno aprovado.");
			}
		}
		
		
		sc.close();
	}

}
