import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		double percentual;
		if(salario <= 400.00) {
			percentual = 15.0;
		}
		else if  (salario <= 800.00) {
			percentual = 12.0;
		}
		else if  (salario <= 1200.00) {
			percentual = 10.0;
		}
		else if  (salario <= 2000.00) {
			percentual = 7.0;
		}
		else {
			percentual = 4.0;
		}		
		
		
		double aumentoDeSalario = salario * percentual / 100.0;
		double salarioFinal = salario + aumentoDeSalario;
		
		System.out.printf("Novo salario: %.2f\n", salarioFinal);
		System.out.printf("Reajuste ganho: %.2f\n", salarioFinal - salario);
		System.out.printf("Em percentual: %.2f\n", percentual);
		
		sc.close();
	}

}
