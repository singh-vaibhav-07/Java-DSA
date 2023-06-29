public class subarrays {

    public static void printSubArrays(int arr[]) {

        int total = 0; // to find total number of subarrays // (for n = n*n+1 / 2)
        // outerloop
        for (int i = 0; i < arr.length; i++) {
            // to fix starting value
            int start = i; // i = 1st 2nd 3rd 4th ...

            for (int j = i; j < arr.length; j++) {
                // to fix end value and print every pairs between start and end
                int end = j;

                for (int k = start; k <= end; k++) { // to print
                    System.out.print(arr[k] + " "); // subarrays
                }
                total++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays is : " + total);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArrays(arr);
    }
}
