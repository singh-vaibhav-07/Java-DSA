import java.util.Scanner;

public class pr_rev_of_num {
    public static void main(String[] args) {
        // Print reverse of a number --------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int n = sc.nextInt();
        int lastdigit;

        while (n > 0) {
            lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;

        }
    }
}
