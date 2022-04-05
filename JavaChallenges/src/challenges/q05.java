package challenges;

import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int root = (int) Math.sqrt(number);

        if(root*root == number){

            System.out.println(number+" is a perfect square");
        }
        else{
            System.out.println(number+" is not a perfect square");
        }
    }

}
