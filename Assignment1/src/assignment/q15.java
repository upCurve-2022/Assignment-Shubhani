package assignment;
import java.util.Scanner;
public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print((int)Math.pow(i, 2)+" ");
		}
	}

}
