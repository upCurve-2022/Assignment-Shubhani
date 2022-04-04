package assignment;
import java.util.Scanner;

public class q09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n_reversed=0;
		
		while(n>0) {
			int remainder = n%10;
			n/=10;
			n_reversed = n_reversed*10+remainder;
		}
		System.out.println(n_reversed);
	}
}
