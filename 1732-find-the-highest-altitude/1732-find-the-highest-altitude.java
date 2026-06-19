class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] ans = new int[n+1];
        ans[0] = 0;
        int idx = 1;
        int max = 0;
        for(int ele : gain){
            ans[idx] = ele + ans[idx-1];
            max = Math.max(max , ans[idx]);
            idx++;
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna