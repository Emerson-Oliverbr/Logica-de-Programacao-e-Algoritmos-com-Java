import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double precoTotal = 0.0;
		if (codigo == 1) {
			precoTotal = quantidade * 4.0;
		}
		else if (codigo == 2) {
			precoTotal = quantidade * 4.50;
		}
		else if (codigo == 3) {
			precoTotal = quantidade * 5.0;
		}
		else if (codigo == 4) {
			precoTotal = quantidade * 2.00;
		}
		else if (codigo == 5) {
			precoTotal = quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f\n ", precoTotal);
		sc.close();
	}

}
