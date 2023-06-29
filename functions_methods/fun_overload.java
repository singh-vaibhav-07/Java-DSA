import java.util.Scanner;

/* USING FUNCTION PARAMETERS */
// public class fun_overload {

//     public static int multiply(int num1,int num2) {
//         return (num1 * num2);

//     }
//     public static int multiply(int num1,int num2, int num3) {
//         return (num1 * num2 * num3);

//     }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         int result = multiply(2,3,4);
//         System.out.println("The product is : " + result);
//     }
// }

/* USING DATA TYPES */
public class fun_overload {

    // function to calculate int sum
    public static int sum(int num1, int num2) {
        return (num1 + num2);

    }

    // function to calculate float sum
    public static float sum(Float num1, Float num2) {
        return (num1 + num2);

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int result = sum(2, 3);
        // sum(4.1f,1.2f);

        System.out.println("The sum is : " + sum(4.1f, 1.2f));
    }
}
