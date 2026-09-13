class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = (2*i)+1;
        }
        int mid = arr[n/2];
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum + Math.abs(mid - arr[i]);
        }
        return sum/2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna