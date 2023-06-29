import java.util.Scanner;

public class factorial {

    public static int Factorial(int num) {
        int fact = 1;
        if (num < 0) {
            return -1;
        }
        if (num == 1 || num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbe to find factorial : ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is : " + Factorial(n));

    }
}
