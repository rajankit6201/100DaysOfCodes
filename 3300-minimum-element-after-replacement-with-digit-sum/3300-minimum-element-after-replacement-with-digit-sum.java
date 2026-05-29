class Solution {
    public int minElement(int[] nums) {
        
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int val = nums[i];
            int sum = 0;
            while(val != 0){
                sum = sum  + val%10;
                val = val/10;
            }
            nums[i] = sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna