public class First_occurence {
    public static int checkFirst(int arr[], int key, int i) {
        // Approach
        // 1. Compare with self
        // 2. Look forward
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return checkFirst(arr, key, i + 1);
    }

    public static int lastOccur(int arr[], int key, int i) {
        // Approach
        // Look forward
        // Compare with self
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 5, 7 };
        // int res = checkFirst(arr, 7, 0);
        // System.out.println(res);

        System.out.println(lastOccur(arr, 7, 0));

    }
}
