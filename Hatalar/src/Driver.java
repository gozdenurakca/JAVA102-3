import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //arithExcep();
        //arrayExcep();
        //nullPointerExcep();
    }
    public static void arithExcep() {
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println(sayi/sayi2);
    }
    public static void arrayExcep() {
        int[] numbers = {0, 1, 2, 3, 4};
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        System.out.println(numbers[index]);
    }
    public static void nullPointerExcep() {
        Scanner input = null; // heap'te hiçbir şeye referans etmemektedir.
        String line = input.nextLine();
        System.out.println(line);

    }
}
