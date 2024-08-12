package for_loops;

import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int number = scanner.nextInt();
        
        int multiplier;
        for (multiplier = 1; multiplier <= 10; ++multiplier) {
            System.out.println(number + " * " + multiplier + " = " + (multiplier * number));
        }
    }
}

