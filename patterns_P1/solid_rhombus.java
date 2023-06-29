public class solid_rhombus {
    public static void rhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // inner loop

            // space = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars = n, in in every i
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombusPattern(5);
    }
}
