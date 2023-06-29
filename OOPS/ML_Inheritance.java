// Animal
// |
// Mamals
// |
// Dogs

public class ML_Inheritance {
    public static void main(String[] args) {
        Dogs dobby = new Dogs();
        dobby.eat();

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
    int legs;
}

// Dogs is inheritng from Mamals
class Dogs extends Mamals {
    String breed;
}
