package challenges;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = (n1>n2 ? (n1>n3 ? n1:n3) : (n2>n3 ? n2:n3));
        System.out.println(max);
    }
}
