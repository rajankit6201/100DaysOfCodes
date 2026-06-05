class Solution {
    public int trailingZeroes(int n) {
        int  count = 0;
        while(n  >=5){
            count += n/5;
            n/=5;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna