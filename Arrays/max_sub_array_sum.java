public class max_sub_array_sum {

    public static void maximumSubArray(int arr[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        // outerloop
        for (int i = 0; i < arr.length; i++) {
            // to fix starting value
            int start = i; // i = 1st 2nd 3rd 4th ...

            for (int j = i; j < arr.length; j++) {
                // to fix end value and print every pairs between start and end
                int end = j;
                current_sum = 0;

                for (int k = start; k <= end; k++) { // to print
                    // System.out.print(arr[k] + " "); // subarrays

                    current_sum += arr[k];
                }
                System.out.println(current_sum);
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                }

                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("The maximum of subarray is : " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maximumSubArray(arr);
    }
}
