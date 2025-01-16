import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int codigoDoFuncionario = sc.nextInt();
			int quantidadeDeHorasTrabalhadas = sc.nextInt();
			double salarioPorHora = sc.nextDouble();
			
			double salarioLiquido = quantidadeDeHorasTrabalhadas * salarioPorHora;
			
			System.out.println("NUMBER = " + codigoDoFuncionario);
			System.out.printf("SALARY = US %.2f\n", salarioLiquido);			
			
		sc.close();
	}

}
