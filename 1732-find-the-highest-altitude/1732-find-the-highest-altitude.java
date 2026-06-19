class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] ans = new int[n+1];
        ans[0] = 0;
        int idx = 1;
        for(int ele : gain){
            ans[idx] = ele + ans[idx-1];
            idx++;
        }
        for(int x : ans){
            System.out.print(x + " ");
        }
        Arrays.sort(ans);
        int max = ans[n];
        if(max < 0) return 0;
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna