package challenges;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int a=0, b=0;
        while(a<s1.length()){
            if(s1.charAt(a)==s2.charAt(b)){
                a++;
                b++;
            }
            else{
                a++;
            }
            if(b==s2.length()){
                System.out.println("s2 is in s1");
            }
        }
        System.out.println("s2 not in s1");
    }
}
