package assignment;

public class q04{
	public static void main(String[] args) {
		swap2(10,20);
		swap3(10,20,30);
	}
	public static void swap2(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swap2: "+a+" "+b);
	}
	public static void swap3(int a, int b, int c) {
		int temp;
		temp=a;
		a=b;
		b=c;
		c=temp;
		System.out.println("Swap3:"+a+" "+b+" "+c);
	}
}
