public class N_fibo {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib = fibonacci(n - 1) + fibonacci(n - 2);
        return fib;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));

    }
}
// 0 1 1 2 3