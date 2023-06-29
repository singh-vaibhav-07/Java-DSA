import java.util.Scanner;

public class rev_a_no {
    public static void main(String[] args) {
        // REVERSE THE GIVEN NUMBER :- 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int n = sc.nextInt();

        int reverse = 0;
        while (n>0) {
            int lastdigit = n%10;
            reverse = (reverse * 10)+lastdigit;
            n/=10;
        }
        System.out.println("The reverse of a number is : " + reverse);


    }
}
