public class min_sub_array_sum {

    public static void minOfSubArraySum(int arr[]) {
        int current_sum = 0;
        int min_Sum = Integer.MAX_VALUE; 


        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                current_sum = 0;

                for (int k = start; k < end; k++) {
                    current_sum += k;
                }
                System.out.println(current_sum);
                if (min_Sum > current_sum) {
                    min_Sum = current_sum;
                }
            }
            
        }
        System.out.println("The minimum value of subarray is : " + min_Sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        minOfSubArraySum(arr);
    }
}
