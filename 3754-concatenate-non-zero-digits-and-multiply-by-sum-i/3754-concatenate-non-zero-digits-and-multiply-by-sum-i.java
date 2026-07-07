class Solution {
    public long sumAndMultiply(int n) {
        int rev = 0;
        while(n != 0){
            int rem = n%10;
            if(rem == 0){
                n/=10;
                continue;
            } 
            n/=10;
            rev = rev*10 + rem;  
        }
        long orignal = 0;
        int sum = 0;
        while(rev != 0){
            int rem = (int)rev%10;
            orignal = orignal *10 + rem;
            sum+=rem;
            rev/=10;
        }
        return orignal * sum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna