import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        while(true) {
            System.out.println("Bir sayı giriniz: ");
            number = input.nextInt();
            if (number % 2 != 0) {
                break;
            }
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        }
        System.out.println("Toplam: " + sum);
    }
}

