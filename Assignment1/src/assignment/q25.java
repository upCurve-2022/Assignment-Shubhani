package assignment;

import java.util.Scanner;

public class q25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		String rev_string = "";
		for(int i=len-1; i>=0; i--) {
			rev_string = rev_string+str.charAt(i);
		}
		System.out.println(rev_string);
	}
}
