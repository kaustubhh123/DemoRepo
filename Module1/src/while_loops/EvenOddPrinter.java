
public class EvenOddPrinter {

    public static void main(String[] args) {
        
        int number = 0;
        System.out.println("Even numbers...");
        number = 0;
        while (number < 20) {
            System.out.println(number);
            number += 2;
        }
        
        System.out.println("Odd numbers...");
        number = 1;
        while (number < 20) {
            System.out.println(number);
            number += 2;
        }
    }
}

