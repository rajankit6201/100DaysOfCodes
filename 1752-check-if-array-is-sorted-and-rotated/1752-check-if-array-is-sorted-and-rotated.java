class Solution {
    public boolean check(int[] nums) {
        
        int n = nums.length;
        int countBreaks = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
            
            if (countBreaks > 1) {
                return false;
            }
        }
        
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna