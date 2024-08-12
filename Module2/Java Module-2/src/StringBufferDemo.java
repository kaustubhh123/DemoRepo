public class StringBufferDemo {
	public static void main (String args[])
	{
		StringBuffer str1 = new StringBuffer ("Kaustubh");
		StringBuffer str2 = new StringBuffer (" Chavan");

		str1.append(str2);
		System.out.println("Appended string is : "+str1);		
	}
}

