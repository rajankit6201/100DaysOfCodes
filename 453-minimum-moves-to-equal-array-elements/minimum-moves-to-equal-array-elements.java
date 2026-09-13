class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
            minValue = Math.min(minValue , nums[i]);
        }
        return sum - (minValue * nums.length);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna