import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		String nomePessoa1 = sc.next();
		int idadePessoa1 = sc.nextInt();
		String nomePessoa2 = sc.next();
		int idadePessoa2 = sc.nextInt();
		
		double idadeMedia = (idadePessoa1 + idadePessoa2) / 2.0;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", nomePessoa1, nomePessoa2, idadeMedia);
		
		sc.close();
	}
}
