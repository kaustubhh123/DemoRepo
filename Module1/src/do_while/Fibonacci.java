package module1;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int no1=0;
		int no2 = 1;
		int no3;
		System.out.println(no1);
		System.out.println(no2);
		int i = 0;
		do
		{
			no3 = no1 + no2;
			System.out.println(no3);
			no1 = no3;
			no2 = no3;
			 ++i;
		}while ( i < 8);
 

	}

}
