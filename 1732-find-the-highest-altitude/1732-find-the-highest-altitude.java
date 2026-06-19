class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = gain[0];
        for(int i = 1;i<n;i++){
            gain[i] = gain[i] + gain[i-1];
            max = Math.max(max , gain[i]);
        }
        if(max <0) return 0;
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna