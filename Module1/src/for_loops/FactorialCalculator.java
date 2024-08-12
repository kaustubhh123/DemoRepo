package for_loops;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int number = scanner.nextInt();

        int factorial = 1;
        for (int counter = 1; counter <= number; ++counter) {
            factorial = factorial * counter;
        }
        
        System.out.println("Factorial of the number is " + factorial);
    }
}

