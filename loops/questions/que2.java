import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();

            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }

            System.out.println("To continue press 1 or to exit press 0.");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("The sum of even number is " + evenSum);
        System.out.println("The sum of odd number is " + oddSum);

    }
}