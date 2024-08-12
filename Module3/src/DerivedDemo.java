class BaseClass {
    int x = 220;

    BaseClass() {
        System.out.println("In the base class...");
    }

    public void displayX() {
        System.out.println("Value of x: " + x);
    }
}

public class DerivedDemo extends BaseClass {
    DerivedClass() {
        System.out.println("In the derived class...");
    }

    public static void main(String[] args) {
        DerivedDemo d1 = new DerivedDemo();
        d1.displayX();
    }
}

