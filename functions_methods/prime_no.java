import java.util.Scanner;
import java.lang.Math;

public class prime_no {

    /*
     * public static boolean isPrime(int n) {
     * // corner case
     * if (n == 2) {
     * return true;
     * }
     * boolean flag = true;
     * for (int i = 2; i <= n - 1; i++) {
     * if (n % i == 0) {
     * // return false;
     * flag = false;
     * break;
     * // return flag;
     * }
     * }
     * return flag;
     * }
     */

    // OPTIMIZED PRIME NUMBER CHECKING FUNCTION
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.println("The number is prime : " + isPrime(n));

    }
}
