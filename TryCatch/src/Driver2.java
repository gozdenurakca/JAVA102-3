import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4};
        Scanner input = new Scanner(System.in);
        System.out.print("Index değerini giriniz: ");
        int index = input.nextInt();
        /*try {
            System.out.println(numbers[index]);
        } catch (Exception e) {
            System.out.println("Yanlış index numarası girdiniz.");
        } finally {
            input.close();
            System.out.println("Finally..");
        }

         */
        if (index <= numbers.length) {
            System.out.println(numbers[index]);
        } else {
            System.out.println("Yanlış index numarası");
        }
    }
}
