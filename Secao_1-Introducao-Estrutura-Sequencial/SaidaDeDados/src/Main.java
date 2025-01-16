import java.util.Locale;

public class Main {	
	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.123456;
		String nome = "Emerson";
		int idade = 31;
		double salario = 4000.0;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("Bom dia");
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros\n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, salario);
	}
}
