package assignment;

public class q05 {
	public static void main(String[] args) {
		evenOdd(25);
		evenOdd(36);
	}
	public static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}
