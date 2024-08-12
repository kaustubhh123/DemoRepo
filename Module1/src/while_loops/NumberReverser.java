
import java.util.Scanner;

public class NumberReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int inputNumber = scanner.nextInt();
        
        int remainder, reversedNumber = 0;
        
        while (inputNumber > 0) {
            remainder = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            inputNumber = inputNumber / 10;
        }
        
        System.out.println("Reversed number is " + reversedNumber);
    }
}

