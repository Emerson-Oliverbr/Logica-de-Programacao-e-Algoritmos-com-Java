import java.util.Locale;
public class Main {

	public static void main(String[] args) {		
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritorio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'M';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos: ");
		System.out.printf("%s Custa: R$ %.2f\n", produto1, preco1);
        System.out.printf("%s Custa: R$ %.2f\n", produto2, preco2);
        System.out.println();
        System.out.printf("Registro: %d anos, codigo: %d e genero: %s", idade, codigo, genero);
        System.out.printf("Medida com oito casas decimais: %.8f\n", medida);
        System.out.printf("Medida com três casas decimais: %.3f\n", medida);
        System.out.printf("Uso de ponto como separador decimal: %.3f\n", medida);
        Locale.setDefault(Locale.US);
	}

}
