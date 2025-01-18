import java.util.Locale;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] valores = new double[N];
		
		for(int index=0; index<N; index+=1) {
			valores[index] = sc.nextDouble();
		}
		
		for(int index=0; index<N; index+=1) {
			System.out.printf("%.2f\n", valores[index]);
		}		
		
		sc.close();
	}

}
