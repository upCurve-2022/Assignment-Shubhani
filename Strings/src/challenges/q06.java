package challenges;

public class q06 {
    public static void main(String[] args) {
        String str1 = "Target";
        String str2 = "target";
        Object str = str1;

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareToIgnoreCase(str.toString()));
    }
}
