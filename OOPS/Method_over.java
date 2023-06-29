// Method Overriding

// Parent and child classes both contains the same function with a different definition.
// same name - same parameters , but different kaam
// parent and child class ke pass same function name ho but kaam me alag ho

public class Method_over {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer {
    void eat() {
        System.out.println("Eats grass");
    }
}

// jab v overriding hoti hai toh function jo child class me hoga wahi call hoga