package challenges;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        while(n!=1){
            if(n%5==0)
                n/=5;
            else if(n%3==0)
                n/=3;
            else if(n%2==0)
                n/=2;
            else {
                System.out.print("It is not an ugly number");
                a = 1;
                break;
            }
        }
        if (a==0)
            System.out.print("It is an ugly number.");

    }
}


