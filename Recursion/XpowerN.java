public class XpowerN {

    // public static int checkPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // return x * checkPower(x, n - 1);
    // }

    // more optimized code
    public static int checkPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = checkPower(x, n / 2);
        int halfpowersq = halfpower * halfpower;

        if (n % 2 != 0) {
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 25;

        System.out.println(checkPower(x, n));
    }
}
