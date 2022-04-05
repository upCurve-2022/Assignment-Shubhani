package challenges;

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        String str = "I am always ready to learn although I do not always like being taught.";
        char[] arr = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if(arr[i]=='a'){
                arr[i]='$';
            }
        }
        System.out.println(arr);
    }
}
