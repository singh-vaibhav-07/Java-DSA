import java.net.Socket;

// static keyword is used to share the same variable or methods of a given class.

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "APS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "FAI";

    }

}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
