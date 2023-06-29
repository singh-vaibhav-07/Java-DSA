// Hybrid inheritance is a combination of many inheritance

public class Hybrid {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
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

// Animal -> Fish
class Fish extends Animal {
    void swmin() {
        System.out.println("Fish swims in water");
    }
}

// Animal -> Fish -->> whale
class Whale extends Fish {
    void largest() {
        System.out.println("Whale is the largest fish");
    }
}

// Animal -> Bird
class Bird extends Animal {
    void fly() {
        System.out.println("birds fly in the sky");
    }
}

// Animal -> Bird -->> Parrot
class Parrot extends Bird {
    void parr() {
        System.out.println("Parrot is of green colour");
    }
}

// Animal -> Mamals
class Mamals extends Animal {
    void walks() {
        System.out.println("Mamals walks on foot");
    }
}

// Animal -> Mamals -->> Dogs
class Dogs extends Mamals {
    void bark() {
        System.out.println("Dogs barks...");
    }
}
