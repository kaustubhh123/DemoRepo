
public class EvenOddPrinter {

    public static void main(String[] args) {
        
        int index = 0;
        System.out.println("Even numbers...");
        for (index = 0; index < 20; index += 2)
            System.out.println(index);
        
        System.out.println("Odd numbers...");
        for (index = 1; index < 20; index += 2)
            System.out.println(index);
    }
}

