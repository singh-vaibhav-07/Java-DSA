public class MaxSubSumPrefix {
    public static void maxSubARRAYSumPrefix(int arr[]) {
        int prefix[] = new int[arr.length];
        int cur_sum = 0;
        int maxSum = Integer.MIN_VALUE;

        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                cur_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < cur_sum) {
                    maxSum = cur_sum;
                }
            }
        }
        System.out.println("max sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubARRAYSumPrefix(arr);
    }
}
