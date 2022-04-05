package challenges;

import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(volume(r,h));
    }
    public static double volume(int r, int h){
        double volume = 3.14*r*r*h;
        return volume;
    }
}
