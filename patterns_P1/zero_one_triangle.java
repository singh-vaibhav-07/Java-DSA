public class zero_one_triangle {
    public static void zrTriangle(int n) {
        // outerloop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        zrTriangle(5);
    }
}