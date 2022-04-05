package challenges;

import java.io.File;

public class q08 {
    public static void main(String[] args) {
        try{
            File file = new File("file08.txt");
            boolean created = file.createNewFile();
            if(created){
                System.out.println("File created");
            }
            else{
                System.out.println("File Already Exists");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
