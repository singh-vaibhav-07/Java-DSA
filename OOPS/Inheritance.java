// When property and methods of BASE class is passed on to the DERIVED class.
// Four major types of inheritance are :- 
// 1. Single level Inheritance
// 2. Multi level Inheritance
// 3. Hierarchial Inheritance
// 4. Hybrid Inheritance

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }

}

// SINGLE LEVEL INHERITANCE :- Single base class and single derived class.

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

// derived class
class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("Swims in water");
    }
}