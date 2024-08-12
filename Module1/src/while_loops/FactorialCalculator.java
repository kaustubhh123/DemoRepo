
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int number = scanner.nextInt();

        int factorial = 1;
        int counter = 1;
        while (counter <= number) {
            factorial *= counter;
            ++counter;
        }
        
        System.out.println("Factorial of the number is " + factorial);
    }
}

