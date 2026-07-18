class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int low =   nums[0];
        int n = nums.length;
        int high = nums[n-1];
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