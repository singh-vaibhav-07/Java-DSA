// Time Complexity = O(n) 
// -> proportional to length of height
// -> if height is 10 loop will run 10 times

public class trapping_water {
    public static int TrapWater(int height[]) { // Time Complexity = O(n) -> proportional to length of height
        int n = height.length; // -> if height is 10 loop will run 10 times
        /*
         * // calculate left max boundary - array
         * // calculate right max boundary - array
         * 
         * // loop
         * // waterLevel = min(leftmax bound, rightmax bound)
         * // trapped water = waterlevel - height[i]
         */

        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) { // i=1 qki 0 ke le liye already ho chuka hai
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int tw = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bound)
            int wl = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            tw += wl - height[i];
        }

        return tw;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrapWater(height));
    }
}
