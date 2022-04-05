package challenges;

import java.util.Scanner;

class ZipCodeException extends Exception{
    public ZipCodeException(String str){
        super(str);
    }
}

public class Swiggy {
    public static void check(int code) throws ZipCodeException{
        if(code == 123 || code==456||code==789){
            throw new ZipCodeException("Sorry for the inconvenience but delivery in this area is not available.");
        }
        else{
            System.out.println("Delivery is available in this area!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter zipcode of your area");
        int code = sc.nextInt();
        try{
            check(code);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
