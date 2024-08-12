
import java.util.Scanner;

public class DigitSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int number = scanner.nextInt();
        
        int digit, totalSum = 0;
        
        while (number > 0) {
            digit = number % 10;
            totalSum += digit;
            number = number / 10;
        }
        System.out.println("Sum of the digits is " + totalSum);
    }
}

