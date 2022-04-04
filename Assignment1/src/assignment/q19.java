package assignment;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        int num,i=0;
        int[] binary = new int[10];
        Scanner sc = new Scanner((System.in));
        num = sc.nextInt();
        while(num!=0){
            binary[i]= num%2;
            num /=2;
            i++;
        }
       
        for(int j=i-1; j>=0; j--){
            System.out.print(""+ binary[j]);
        }
    }
}