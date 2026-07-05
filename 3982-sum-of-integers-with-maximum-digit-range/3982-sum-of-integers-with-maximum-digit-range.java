class Solution {
    public int maxDigitRange(int[] nums) {
        int digitRange = 0;
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            int val = nums[i];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            while(val != 0){
                int rem = val%10;
                max = Math.max(max, rem);
                min = Math.min(min,rem);
                val = val/10;
            }
            if(digitRange < max-min){
                ans = nums[i];
                digitRange = max - min;
            }
           else if(digitRange == max-min){
                ans = ans + nums[i];
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna