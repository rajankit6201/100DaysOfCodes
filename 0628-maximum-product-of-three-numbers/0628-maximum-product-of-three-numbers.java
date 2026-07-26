class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int negMulti = nums[0] * nums[1];
        int n = nums.length;
        int posMulti = nums[n-1] * nums[n-2];
        
        return Math.max((posMulti * nums[n-3]) ,negMulti * nums[n-1] );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna