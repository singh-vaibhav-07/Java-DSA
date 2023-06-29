import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for sum and product of a number.
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum = a+b;
        int prod = a*b;
        // System.out.println(sum);
        System.out.println(prod);
        */

        
        //  area of a circle.
        float r = sc.nextFloat();
        // double area = 3.14 * r * r;
        float area = 3.14f * r * r;
        System.out.println(area);
       

        
    }
}