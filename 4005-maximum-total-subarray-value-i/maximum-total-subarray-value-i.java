class Solution {
    public long maxTotalValue(int[] A, int k) {
        int min = A[0], max = A[0];

        for (int n : A) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return (long) (max - min) * k;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna