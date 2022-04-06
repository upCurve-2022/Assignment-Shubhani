package challenges;

public class q07 {
    public static void main(String[] args) {
        String str = "134-10/5566 A-block, Manyata Tech-Park";
        System.out.println(str);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='-'){
                if(Character.isDigit(str.charAt(i-1)) && Character.isDigit(str.charAt(i+1))){
                    str = str.substring(0,i)+str.substring(i+1);
                }
            }
        }
        System.out.println(str);
    }
}
