
import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int number = scanner.nextInt();
        
        int remainder, totalSum = 0;
        
        for (; number > 0; number = number / 10) {
            remainder = number % 10;
            totalSum = totalSum + remainder;
        }
        System.out.println("Sum of the digits is " + totalSum);
    }
}

