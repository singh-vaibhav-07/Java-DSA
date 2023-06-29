public class Sorted_Array {
    public static boolean checkSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checkSorted(arr, i + 1);

    }

    public static void main(String[] args) {
        // int arr[] = { 2, 5, 3, 9, 10 };
        int arr[] = { 2, 5, 7, 9, 10 };
        System.out.println(checkSorted(arr, 0));

    }
}
