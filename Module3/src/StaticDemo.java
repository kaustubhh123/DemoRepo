
public class StaticDemo {	
	static int x = 230;	
	public static void DisplayMessage() {System.out.println("In the static function");}
	static
	{
		System.out.println("In the static block");
	}
	public static void main (String args[])
	{		
		System.out.println("Value of static variable : " +StaticDemo.x);
		StaticDemo.DisplayMessage();		
	}}
