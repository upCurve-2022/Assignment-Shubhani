package challenges;

import java.io.FileOutputStream;

public class q09 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("file09.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        fos.close();
    }
}
