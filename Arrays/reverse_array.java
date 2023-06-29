public class reverse_array {
    public static void ArrayReverse(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first <= last) {
            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 8, 1, 6 };
        ArrayReverse(arr);
        System.out.print("Reverse of an array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
