public class decimaltobinary {
    public static void decToBin(int n) {
        int myNum = n;
        int p = 0;
        int bin = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10,p));
            p++;
            n = n/2;
        }
        System.out.println("Binary of " + myNum + " is " + bin);
        
    }
    public static void main(String[] args) {
        decToBin(4);
    }
}
