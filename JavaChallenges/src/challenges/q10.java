package challenges;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class q10 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        String destination = sc.next();
        FileReader fin = new FileReader(source);
        FileWriter fout = new FileWriter(destination, true);
        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        System.out.println("Copy finish...");
        fin.close();
        fout.close();
    }
}