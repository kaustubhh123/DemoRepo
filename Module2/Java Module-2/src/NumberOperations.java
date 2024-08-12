import java.util.Scanner;

public class NumberOperations {
    static int calculateSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number...");
        int number = scanner.nextInt();
        int result = NumberOperations.calculateSquare(number);
        System.out.println("Square of " + number + " is " + result);
    }
}

