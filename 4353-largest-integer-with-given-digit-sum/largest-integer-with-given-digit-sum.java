class Solution {
    public int largestInteger(int n, int s) {
        if(n*9 < s) return -1;
        int large = 0;
        int count =0;
        while(s > 9){
            count++;
            large = large *10 + 9;
            s-=9;
        }
        if(s != 0){
            large = large*10 + s;
            count++;
        }

        count = n-count;
        while(count != 0){
            large*=10;
            count--;
        }
        return large;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna