public class GridWays {
    public static int gridW(int i, int j, int m, int n) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } 
        else if (i == n || j == n) { // boundary cross condition
            return 0;
        }

        int w1 = gridW(i + 1, j, m, n);
        int w2 = gridW(i, j + 1, m, n);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridW(0, 0, m, n)); // Time = O(2^(m+n)) -> bht hi chutiya type ka time hai
    }
}
