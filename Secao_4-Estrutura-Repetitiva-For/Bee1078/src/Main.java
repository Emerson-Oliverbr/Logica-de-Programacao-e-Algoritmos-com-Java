import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int index=1; index<=10; index+=1) {
			System.out.println(index + " x " + n + " = " + (index * n));
		}
		
		sc.close();
	}

}
