public class Student {
    int regNo;
    String name;
    String stream;

    // Constructor
    Student() {
        regNo = this.regNo;
        name = this.name;
        stream = this.stream;

        System.out.println("In the constructor of student");
    }

    public static void main(String[] args) {
        Student student1 = new Student();
    }
}

