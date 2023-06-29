public class number_pyramid {

    public static void numberPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        numberPyramid(5);
    }
}