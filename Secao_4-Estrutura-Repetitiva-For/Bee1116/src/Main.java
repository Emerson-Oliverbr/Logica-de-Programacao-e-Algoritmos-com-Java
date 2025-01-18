import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int index=1; index<=N; index +=1) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if(n1 > n2) {
				double resultado = (double) n1/n2;				
				System.out.println(resultado);
			}
			else {
				System.out.println("divisão impossivel");
			}
		}
		sc.close();
	}

}
