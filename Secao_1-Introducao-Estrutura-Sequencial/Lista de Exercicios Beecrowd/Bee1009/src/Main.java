import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String nomeDoVendedor = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalEmVendas = sc.nextDouble();
		
		double salarioBruto =  totalEmVendas  * 15.0 / 100.0 + salarioFixo;
		
		System.out.printf("TOTAL = %.2f%n ", salarioBruto);
		
		sc.close();
	}

}
