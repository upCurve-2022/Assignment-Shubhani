package challenges;

import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(((year%4==0) && (year%100!=0))||(year%400==0)){
            System.out.println(year+" is leap");
        }
        else{
            System.out.println(year+" is not leap");
        }
    }
}
