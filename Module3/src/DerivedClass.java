

class BaseClass
{	
	int x=220;	
	public void displayX() {System.out.println("Value of x : "+x);}	
}
public class DerivedClass extends baseClass
{
	public static void main (String args[])
	{
		DerivedClass d1 = new DerivedClass();
		d1.displayX();
	}
}
