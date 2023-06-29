public class butterfly {
    public static void buttPattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop

            // star -- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // star -- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ----------------- 2nd HALF ------------------

        // outer loop
        for (int i = n; i >= 1; i--) {
            // inner loop

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        buttPattern(5);
    }
}
