package challenges;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char ch = sc.next().charAt(0);
        String deletedString = str.replace(ch, Character.MIN_VALUE);
        System.out.println(deletedString);
    }
}
