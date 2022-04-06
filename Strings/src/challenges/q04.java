package challenges;

import java.util.Scanner;

public class q04 {
    public static boolean isEmpty(String str){
        return str.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isEmpty(str));
    }
}

