import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		double[] compra = new double[N];
		double[] venda = new double[N];
		
		for (int index=0; index<N; index+=1) {
			nomes[index] = sc.next();
			compra[index] = sc.nextDouble();
			venda[index] = sc.nextDouble();
		}
		
		int contAbaixoDe10 = 0;
		int contEntre10E20 = 0;
		int contAcimaDe20 = 0;
		for (int index=0; index<N; index+=1) {
			
			double lucro = venda[index] - compra[index];

			double porcentagemDeLucro = lucro / compra[index] * 100.0;

			if (porcentagemDeLucro < 10.0) {
				contAbaixoDe10+=1;
			}
			else if (porcentagemDeLucro <= 20.0) {
				contEntre10E20+=1;
			}
			else {
				contAcimaDe20+=1;
			}
		}
		System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
		System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
		System.out.println("Lucro acima de 20%: " + contAcimaDe20);
		
		double totalCompra = 0.0;
		double totalVenda = 0.0;
		for (int index=0; index<N; index+=1) {
			totalCompra = totalCompra + compra[index];
			totalVenda = totalVenda + venda[index];
		}

		double totalLucro = totalVenda - totalCompra;
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);
		
		sc.close();
	}
}