package assignment;
import java.util.Scanner;

public class q23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=2, b=1;
		for(int i=0; i<=n; i++) {
			if(i%2!=0) {
				System.out.print(-a+" ");
				a+=4;
			}
			else {
				System.out.print(b+" ");
				b+=3;
			}
		}
	}
}
