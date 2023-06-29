public class diamond {
    public static void patDiamond(int n) {
        // upper half

        // outerloop
        for (int i = 1; i <= n; i++) {
            // inner loop

            // space = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars -->> odd = 2i-1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ------- LOWER HALF -------

        // outerloop
        for (int i = n; i >= 1; i--) {
            // inner loop

            // space = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars -->> odd = 2i-1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        patDiamond(5);
    }
}
