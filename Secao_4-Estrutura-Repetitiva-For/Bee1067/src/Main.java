import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int index=1; index<=x; index +=1) {
			if(index % 2 != 0) {
				System.out.println(index);
			}
		}
		
		sc.close();
	}

}
