class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> hash  = new HashSet<>();
        int val = 0;
        int n = digits.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i ==j) continue;
                for(int k = 0;k<n;k++){
                    if(k==i || k ==j)continue;
                    val = digits[i];
                    val = val *10 + digits[j];
                    val = val*10+digits[k];
                    if(val >99 && val<1000)
                    if(val%2==0) hash.add(val);

                }
            }
        }
        return hash.size();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna