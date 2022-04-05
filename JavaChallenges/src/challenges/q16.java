package challenges;

public class q16 {
    public static void main(String[] args) {
        String sentence = "Hey! Welcome to Bengaluru.";
        int count;
        char[] string = sentence.toCharArray();
        for(int i=0; i<string.length;i++){
            count=1;
            for(int j=i+1; j<string.length; j++){
                if(string[i]==string[j] && string[i]!=' '){
                    count++;
                    string[j]='0';
                }
            }
            if(count>1 && string[i]!='0'){
                System.out.println(string[i]);
            }
        }
    }
}
