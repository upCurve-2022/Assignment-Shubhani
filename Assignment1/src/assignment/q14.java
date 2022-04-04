package assignment;
import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[100];
		arr[0]=1;
		arr[1]=4;
		arr[2]=7;
		
		for(int i=0;i<n;i++) {
			arr[i+3] = arr[i+2]+arr[i+1]+arr[i];
			System.out.print(arr[i]+" ");
		}
    }
}