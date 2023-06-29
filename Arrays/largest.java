public class largest {
    public static int findLargest(int arr[]) {
        int large = Integer.MIN_VALUE; // negative infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static int findSmallest(int arr[]) {
        int small = Integer.MAX_VALUE; // postive infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 8, 1, 6 };
        System.out.println("The largest element is : " + findLargest(arr));
        System.out.println("The smallest element is : " + findSmallest(arr));
    }
}
