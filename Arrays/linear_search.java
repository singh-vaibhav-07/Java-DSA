import java.util.Scanner;

public class linear_search {
    public static int searchLinear(int arr[], int Key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value to search : ");
        int key = sc.nextInt();

        int index = searchLinear(arr, key);
        System.out.println("Element is at index : " + index);

    }
}
