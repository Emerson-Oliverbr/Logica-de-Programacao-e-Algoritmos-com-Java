import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int index = 1; index <= N; index += 1) {
			int x = sc.nextInt();
			
			if (x == 0) {
				System.out.println("NULL");
			}
			else if (x % 2 == 0 && x < 0) { 
				System.out.println("EVEN NEGATIVE");
			}
			else if (x % 2 == 0 && x > 0) { 
				System.out.println("EVEN POSITIVE");
			}
			else if (x % 2 != 0 && x > 0) { 
				System.out.println("ODD POSITIVE");
			}
			else {
				System.out.println("ODD NEGATIVE");
			}
		}
			
		sc.close();
	}

}
