package assignment;
import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print((int)Math.pow(i,i)+" ");
		}
    }
}