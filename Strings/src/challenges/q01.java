package challenges;

import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Target";
        String str2 = "Target";
        isSame(str1, str2);
        str1 += "Corporation";
        isSame(str1, str2);
    }

    public static void isSame(String a, String b){
        if(a==b){
            System.out.println("String is immutable");
        }
        else{
            System.out.println("String is mutable");
        }
    }
}
