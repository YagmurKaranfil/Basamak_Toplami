import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number, counter, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        number = input.nextInt();


        while (number != 0) {

            counter = number % 10;
            result += counter;
            number = number / 10;
        }
        System.out.println("Sonuc : " + result);



    }
}