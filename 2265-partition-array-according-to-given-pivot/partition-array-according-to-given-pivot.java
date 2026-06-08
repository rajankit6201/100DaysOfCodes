class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int ele : nums){
            if(ele < pivot){
                li.add(ele);
            }
        }

        for(int ele : nums){
            if(ele == pivot){
                li.add(ele);
            }
        }

        for(int ele : nums){
            if(ele > pivot){
                li.add(ele);
            }
        }
        int n = li.size();
        int[] ans = new int[n];
        int i = 0;
        for(int ele : li){
            ans[i] = ele;
            i++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna