
import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int number = scanner.nextInt();
        
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(number + " * " + multiplier + " = " + (multiplier * number));
            ++multiplier;
        }
    }
}

