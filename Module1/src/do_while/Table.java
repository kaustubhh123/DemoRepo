package module1;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		
		int i=1;
		do
		{
			System.out.println(x + " * " + i + " = "+i * x);
			 ++i;
		}while ( i <= 10);

	}

}

