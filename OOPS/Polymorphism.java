public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // function overloading -> compile time overloading qki compiler ko pehle se
        // pata tha kis time pe konsa sum ko call karna hai ye compiler ko pehle se pata
        // tha.
        System.out.println(calc.sum(7, 1));
        System.out.println(calc.sum(7.1f, 1.3f));
        System.out.println(calc.sum(7, 1, 12));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
