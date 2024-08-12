public class Example
{
    int value = 20;
    public void modifyValue(Example obj)
    {
        obj.value = obj.value * 2;
    }
    public static void main(String args[])
    {
        Example e1 = new Example();
        System.out.println("Before calling the method: " + e1.value);
        e1.modifyValue(e1);
        System.out.println("After calling the method: " + e1.value);
    }
}

