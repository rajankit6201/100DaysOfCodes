class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n;i<=n+10;i++){
            int value =1;
            int data = i;
            while(data != 0){
                value = value * (data %10);
                data = data/10;
            }
            if(value % t == 0) return i;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna