// inverted half pyramid pattern with number 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

public class invRotHalfPyraNum {

    public static void IvRotPyNum(int n) {
        // outerloop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                // print numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        IvRotPyNum(5);
    }
}
