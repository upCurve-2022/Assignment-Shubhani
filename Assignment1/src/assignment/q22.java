package assignment;

import java.util.Scanner;

public class q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a=0, b=1, c;
		for(int i=1; i<=n;i++) {
			System.out.print(b+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
