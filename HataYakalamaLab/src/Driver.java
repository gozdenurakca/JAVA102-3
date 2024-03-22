import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //yaz();
        oku();

    }
    public static void yaz() {
        File file = new File("read.me");
        FileWriter fw = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir yazı giriniz : ");

        try {
            fw = new FileWriter(file);
            fw.write(input.nextLine());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            input.close();
        }
    }
    public static void oku() {
        File file = new File("read.txt");
        FileReader fr = null;
        Scanner input = new Scanner(System.in);
        try {
            fr = new FileReader(file);
            int c = 0;
            while ((c = fr.read()) != -1) {
                System.out.println((char)c);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());

        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                input.close();
            }
        }
    }
}
