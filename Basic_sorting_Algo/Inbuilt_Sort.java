import java.util.Arrays;

public class Inbuilt_Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        int arr[] = { 5, 4, 1, 3, 2, 7, 6, 14 };
        Arrays.sort(arr);
        // Arrays.sort(arr, 2, 5); // starting index to ending index
        printArray(arr);
    }
}
