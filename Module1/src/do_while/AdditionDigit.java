package do_while;
import java.util.Scanner;

public class AdditionDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		int r, s=0;
		
		do
		{
			r = x % 10;
			s = s+ r;
			 x = x / 10;
		}while (x > 0);
		System.out.println("Addedition is "+s);
	}

}
