class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 0;
        right[n-1] = 0;
        for(int i = 0;i<n-1;i++){
            left[i+1] = left[i] + nums[i];
        }

        for(int i = n-1;i>0;i--){
            right[i-1] = right[i] + nums[i];
        }
        for(int i = 0;i<n;i++){
            left[i] = Math.abs(left[i] - right[i]);
        }
        return left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna