package challenges;

import java.text.SimpleDateFormat;
import java.util.Date;

public class q01 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formats = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
        System.out.println(formats.format(date));
    }
}
