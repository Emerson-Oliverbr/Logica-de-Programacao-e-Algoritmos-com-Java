import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double preco = sc.nextDouble();	
		
		double area = largura * comprimento;
		double precoTerreno = preco * area;
		
		System.out.printf("AREA = %.2f\n" , area);
		System.out.printf("PRECO = %.2f\n" , precoTerreno);
		
		sc.close();
	}

}
