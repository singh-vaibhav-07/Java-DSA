import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        // factorial of a number -------

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number : ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of " + n + " is " + fact);
    }
}
