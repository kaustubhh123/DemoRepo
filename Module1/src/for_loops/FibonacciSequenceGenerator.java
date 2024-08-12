
import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        
        int first = 0;
        int second = 1;
        int next;
        System.out.println(first);
        System.out.println(second);
        
        for (int index = 0; index < 8; ++index) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}

