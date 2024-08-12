public class StudentWithParam {
    int regNo;
    String name;
    String stream;

    // Constructor with parameters
    StudentWithParam(int reg, String name1, String stream1) {
        regNo = reg;
        name = name1;
        stream = stream1;
        System.out.println("In the constructor with arguments of student... and the data is " + regNo + " " + name + " " + stream);
    }

    public static void main(String[] args) {
        StudentWithParam student1 = new StudentWithParam(10, "Rohit", "CS");
    }
}

