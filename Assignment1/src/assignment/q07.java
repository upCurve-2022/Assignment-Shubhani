package assignment;

import java.util.Scanner;

public class q07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		largest(a,b,c);
		secondLargest(a,b,c);
	}
	
	public static void largest(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("Largest: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest: "+b);
		}
		else{
			System.out.println("Largest: "+c);
		}
	}
	
	public static void secondLargest(int a, int b, int c) {
		if(a>b && a<c || a>c && a<b){
			System.out.println("Second Largest: "+a);
		}
		else if(b>a && b<c || b>c && b<a){
			System.out.println("Second Largest: "+b);
		}
		else{
			System.out.println("Second Largest: "+c);
		}
	}
}

