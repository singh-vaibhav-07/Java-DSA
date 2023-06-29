import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        // ------- CHECK IF PRIME NUMBER OR NOT -------

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime or not : ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < n - 1; i++) {
            // if (n % i == 0) {
            // System.out.println("The number is not a prime number.");
            // break;
            // } else {
            // System.out.println("The number is prime number.");
            // break;
            // }

            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Nummber is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }
}
