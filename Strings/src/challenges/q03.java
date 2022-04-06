package challenges;

import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            if(Character.isDigit(ch)){
                System.out.println("Contains Digit");
            }
            else{
                System.out.println("Does not contain digit");
            }

        }
    }
}
