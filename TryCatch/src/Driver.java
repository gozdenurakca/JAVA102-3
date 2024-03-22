import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("1. sayıyı giriniz : ");
            int x = input.nextInt();
            System.out.print("2. sayıyı giriniz : ");
            int y = input.nextInt();
            int sonuc = x / y;
            System.out.println("Sonuç : " + sonuc);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getLocalizedMessage());
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            System.out.println("0'a bölünemez !");
        } catch (InputMismatchException exception) {
            System.out.println("Lütfen bir sayı giriniz !");
        } finally {
            input.close(); // sistemden aldığım kaynağı sisteme iade ediyorum.
            System.out.println("Finally..");
        }
        System.out.println("Uygulama kapandı..");
    }
}
