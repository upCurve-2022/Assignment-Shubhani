package assignment;

import java.util.Scanner;

public class q06 {
	 public static void main(String[] args) {
		System.out.println("Enter double value:");
		Scanner sc  = new Scanner(System.in);
		Double num = sc.nextDouble();
		String s = String.valueOf(num);
		int index = s.indexOf(".");
		System.out.print(s.substring(0, index)+" "+s.substring(index+1));
	}
}
