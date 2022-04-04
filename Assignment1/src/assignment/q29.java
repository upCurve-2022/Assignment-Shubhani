package assignment;

import java.util.Scanner;

public class q29 {
	
	 public static void main(String[] args) {
		 int arr[] = {1,2,3,4,5,6};
		 Scanner sc = new Scanner(System.in);	     
	     int n = sc.nextInt();
	     binarySearch(arr,n);
	}
	 
	public static int binarySearch(int[] arr, int n){
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(n<arr[mid]){
                high=mid-1;
            }
            else if(n > arr[mid]){
                low = mid+1;
            }
            else{
                System.out.println("Element found at index: " + mid);
                return mid;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }

   
}