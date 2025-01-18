import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);        
        
        int N = sc.nextInt();        
        
        for (int index = 1; index <= N; index+=1) {
            
            System.out.println(index + " " + (index * index) + " " + (index * index * index));
        }        
        
        sc.close();
    }
}