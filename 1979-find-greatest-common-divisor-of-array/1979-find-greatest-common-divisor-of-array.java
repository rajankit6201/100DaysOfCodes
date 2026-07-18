class Solution {
    public int findGCD(int[] nums) {
       
        int low=100000;
        int high=-1;
        for(int i : nums){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }

        while(low != 0){
            int temp = low;
            low = high%low;
            high = temp;
        }
        return high;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna