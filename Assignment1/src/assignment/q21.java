package assignment;

import java.util.Scanner;

public class q21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=1;
		for(int i=0; i<=n; i++) {
			
			if(i%2!=0) {
				ans += i*i;
				System.out.print(-(ans)+" ");
			}
			else {
				ans += i*i;
				System.out.print(ans+" ");
			}
		}
	}
}
