public class MathOperations {
    static int Overloding(int x) {
        return x * x;
    }
    static double calculateSquare(double x) {
        return x * x;
    }
    public static void main(String[] args) {
        int resultInt = MathOperations.calculateSquare(10);
        double resultDouble = MathOperations.calculateSquare(12.12);
        System.out.println("Square of 10 is " + resultInt);
        System.out.println("Square of 12.12 is " + resultDouble);
    }
}

