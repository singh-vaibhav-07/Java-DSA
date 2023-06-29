// Inverted and rotated half pyramid
//       *
//     * *
//   * * *
// * * * *

public class inverted_half_pyramid {

    public static void invRotPyramid(int n) {
        // outerloop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n-i ; j++) {
                // print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // print star
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invRotPyramid(5);
    }
}
