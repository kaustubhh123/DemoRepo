package module1;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		
		int rem, rev=0;
		
		do
		{
			rem = x % 10;
			rev = rev * 10 + rem;
			 x = x / 10;
			 
		}while (x > 0);
		System.out.println("Reversed number is "+rev);

	}

}
