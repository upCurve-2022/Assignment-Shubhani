package assignment;
import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++){
            if(i%2!=0)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }
}