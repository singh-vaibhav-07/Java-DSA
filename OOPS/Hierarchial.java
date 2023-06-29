// Single BASE class and multiple DERIVED class from same base class.
// Animal -> Mamals
// Animal -> Birds
// Animal -> Fish

public class Hierarchial {
    public static void main(String[] args) {

    }

}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Mamals has inherited from Animal
class Mamals extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

// Dogs has also inherited from Animal
class Fish extends Mamals {
    void swim() {
        System.out.println("Swims");
    }
}

// Bird also inherits from Animal
class Bird extends Animal {
    void fly() {
        System.out.println("Flies");
    }
}
