package challenges;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int count_words=1;

        for(int i=0; i<sentence.length()-1;i++){
            if((sentence.charAt(i)==' ')&&(sentence.charAt(i+1)!=' ')){
                count_words++;
            }
        }
        System.out.println(count_words);
    }
}
