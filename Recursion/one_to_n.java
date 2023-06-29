public class one_to_n {

    public static void printNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
    }

    public static void printNumto1(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printNumto1(n - 1);
    }

    public static void main(String[] args) {
        printNum(10);
        System.out.println();
        printNumto1(5);

    }
}