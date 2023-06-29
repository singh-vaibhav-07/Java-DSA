public class Type_conversion {
    public static void main(String[] args) {
        /*
        Type conversion is possible only when:-
        1. It is Type compatible
        2. Destination type > source type
         */

        // int a = 25;
        // long b = a;
        // -------
        // long a = 25; // will not work as destination 
        // int b = a;   // should be greater
        // System.out.println(b);


        /* ----------- TYPE CASTING ----------- */
        // int marks = (int)(7.14f);
        // System.out.println(marks);

        // float a = 25.07f;
        // // int b = a; // will give error -> lossy conversion

        // int b = (int)(a);
        // System.out.println(b);

        // --------------- TYPE PROMOTION ---------------
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);




    }
}
