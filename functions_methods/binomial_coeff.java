import java.util.Scanner;

public class binomial_coeff {
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

    public static int bincof(int n, int r) {
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nr_fact = Factorial(n - r);

        int result = n_fact / ((r_fact) * (nr_fact));

        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        System.out.println("The result is : " + bincof(n, r));

    }
}
