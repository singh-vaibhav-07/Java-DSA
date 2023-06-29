// abstract -> khayal, means ek idea le lete ki aage kaise kaam hone wala hai
// abstract me ham basic idea de dete hai but implementation ni dete
// PROPERTIES :- 
// 1. Cannot create an instance of abstract class
// 2. Can have constructor
// 3. Can have abstract/non-abstract methods

public class Abstract_class {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); // by def wahi print hoga jo parent cls ka color unless we change in horse class

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); // abstract class ke instance ni create kar sakte
    }
}

// abstract classes woh hote hai jisme ham objects ni bana sakte
abstract class Animal {
    String color;

    Animal() { // abstract class ke ham instance ni bana sakte but constructor bana sakte hai
        color = "brown";
    }

    void eat() { // ye non-abs hai qki isme ham iska implementation de rakhe hai
        System.out.println("animal eats for survival.");
    }

    abstract void walk(); // ye abstract methods hai qki ham abstract function ko implementation nahi dete
    // animal ke jo v subclass honge unke pas walk function hoga but woh animal ni
    // batayega uske subclasses bata denge but animal nahi
}

class Horse extends Animal {
    // animal ke pass walk tha aur ab horse ne inherit kar liya hai toh ab horse ke
    // liye compulsory ho gaya hai ki woh walk methods ko implementation de warna
    // error aayega.
    void walk() {
        System.out.println("Walks on 4 legs");
    }

    void changeColor() {
        color = "black-brown";
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }

    void changeColor() {
        color = "yellow";
    }
}

// walk function Animal pe depend ni kategi woh srf ek ide ade diya hai baki
// agar walk() call hota hai toh woh depend karega ki horse ne call kiya ya
// chicken hai and uske according run karega