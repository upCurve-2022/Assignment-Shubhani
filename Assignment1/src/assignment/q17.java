package assignment;

import java.util.Scanner;

public class q17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i>1){
                int p=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        p++;
                    }
                }
                if(p==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}