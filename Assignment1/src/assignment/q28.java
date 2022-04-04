package assignment;
import java.util.Scanner;

public class q28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int arr[] = {1,2,3,4,5,6};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==a) {
				System.out.println(a+" is found on index "+i);
				break;
			}
			
		}
	}
}
