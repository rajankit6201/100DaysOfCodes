class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j) continue;
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna