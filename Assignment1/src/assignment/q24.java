package assignment;

import java.util.Scanner;

public class q24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=1;
		for(int i=1; i<=b; i++) {
			int t = a;
			c = c*t;
		}
		System.out.println(c);
	}
	
	
}
