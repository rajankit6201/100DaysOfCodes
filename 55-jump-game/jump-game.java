class Solution {
    public boolean canJump(int[] nums) {

        int n= nums.length;
        // if(n==1) return true;
        int idx = nums[0];
        for(int i = 0;i<=idx;i++){
            idx = Math.max(idx , i + nums[i]);
            if(idx >= n-1) return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna