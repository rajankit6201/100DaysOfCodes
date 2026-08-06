class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int low = 0;
        int n = nums.length;
        int high = n-1;
        int lower = -1;

        // first index 
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                lower = mid;
                high = mid-1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        low = 0;
        high = n-1;
        int upper = -1;

        // second index 

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                upper = mid;
                low = mid+1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        ans[0] = lower;

        
        ans[1] = upper;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna