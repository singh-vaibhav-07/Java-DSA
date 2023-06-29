public class Sum_till_N {
    public static int findSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sn1 = findSum(n - 1);
        int sum = n + sn1;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSum(5));

    }
}
