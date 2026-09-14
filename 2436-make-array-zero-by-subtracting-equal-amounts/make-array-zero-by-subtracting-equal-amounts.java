class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna