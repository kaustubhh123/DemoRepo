abstract class Abstract1 {
    abstract void test();
}

public class AbstractDemo extends Abstract1 {
    @Override
    void test() {
        System.out.println("In the test method");
    }

    public static void main(String[] args) {
        AbstractDemo demo = new AbstractDemo();
        demo.test();
    }
}

