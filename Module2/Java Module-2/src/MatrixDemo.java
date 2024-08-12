import java.util.Scanner;

public class MatrixDemo {

    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        int i, j;

        System.out.println("Enter 4 elements for the matrix...");
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 2; ++i) {
            for (j = 0; j < 2; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (i = 0; i < 2; ++i) {
            for (j = 0; j < 2; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

