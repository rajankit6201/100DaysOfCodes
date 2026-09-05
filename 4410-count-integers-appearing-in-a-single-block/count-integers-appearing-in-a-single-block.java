class Solution {
    public int countSpecialIntegers(int[] nums) {
       int[] ans = new int[101];
       int val = nums[0];
       ans[val]++;
       for(int i = 1;i<nums.length;i++){
        if(nums[i] != nums[i-1]){
            ans[nums[i]]++;
        }
       }
       int count = 0;
       for(int i = 0;i<101;i++){
        if(ans[i] == 1){
            count++;
        }
       }
       return count;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna