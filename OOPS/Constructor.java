// special method which is automatically invoked when an object is created.
// has same name as of class.
// no return type not even void.
// constructor is called only once.
// memory allocation happens when a constructor is called.

// ------------------ Types of constructor ------------------
// 1. Non-Parameterized
// 2. Parameterized
// 3. Copy Constructor

public class Constructor {
    public static void main(String[] args) {
        // Student s1 = new Student("Vaibhav");
        // Student s1 = new Student();
        // System.out.println(s1.name);

        // --------------

        // constuctor overloading -> constructor with same name but works differnt based on what arguments is passed (POLYMORPHISM)
        Student s1 = new Student();
        Student s2 = new Student("Vaibhav");
        Student s3 = new Student(7);
        // Student s4 = new Student("vai",7); // error as no such const. exist with
        // these parameter.

    }

}

class Student {
    String name;
    int roll;

    Student() { // this is a non-parameterized constructor as no parameter has been passed
        System.out.println("Constructor has been called...");
    }

    Student(String name) { // this is a parameterized constructor
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
