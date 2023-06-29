public class Copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vaibhav";
        s1.roll = 777;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy
        s2.password = "xyz";

        s1.marks[1] = 100;
        // hamne yaha pe ek chij notice ki that s2 ne marks ko copy pehle hi kar liya
        // tha but copy ke baad v if hamne s1 ki value ko change kiya toh hame s2 me v
        // changes dekhne ko mile --->>> because arrays ka as a reference copy hua hota
        // hai.

        // printing s2 marks
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }

}

class Student {
    String name;
    String password;
    int roll;
    int marks[];

    // shallow copy
    // copy constructor -> s1 ki attributes ko s2 ne copy kar liya

    // Student(Student s1) { // student s1 ka ham parameter le rhe hai
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // Deep copy
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];

        }
    }

    Student() {
        marks = new int[3];
        System.out.println("This is a non-parametrized constructor.");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    // Student(String password){
    // this.password = password;
    // }

}
