class Solution {
    public int index(int[] sort ,int target, int high){
        int low = 0;
        int idx = -1;
        while(low<=high){
            int mid  = low+(high-low)/2;
            if(sort[mid] == target){
                idx = mid;
                high = mid-1;
            } else if(sort[mid]< target) low  = mid+1;
            else high = mid-1;
        }
        return idx;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sort = new int[n];
        int idx =0;
        for(int ele : nums){
            sort[idx] = ele;
            idx++;
        }
        idx = 0;
        Arrays.sort(sort);
        for(int i = 0;i<n;i++){
            nums[i] = index(sort, nums[i] , n-1);
        }
        return nums;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna