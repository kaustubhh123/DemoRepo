
public final class FinalEx {
	final int x = 20;
	
	final void testFunction()
	{
		System.out.println("In the final method");
	}
	
	public static void main (String args[])
	{
		FinalEx f1 = new FinalEx();
		f1.testFunction();
	}
}
