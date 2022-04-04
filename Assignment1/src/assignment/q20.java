package assignment;
import java.util.Scanner;

public class q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int decimal=0;
		for(int i = n, j=1; i>0;i/=10) {
			decimal += (i%10)*j;
			j*=2;
		}
		System.out.println(decimal);
	}
}
