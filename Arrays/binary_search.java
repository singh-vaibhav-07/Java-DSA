public class binary_search {
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 8, 13, 15, 17, 19 };
        int key = 13;
        // binarySearch(arr, key);
        System.out.println("Index at which our element is : " + binarySearch(arr, key));
    }
}
