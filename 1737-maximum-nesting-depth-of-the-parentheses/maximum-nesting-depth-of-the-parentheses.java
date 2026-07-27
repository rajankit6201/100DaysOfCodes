class Solution {
    public int maxDepth(String s) {
        int deft = 0;
        int temp  = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                temp++;
            }
            else if(s.charAt(i) == ')') temp--;
            deft = Math.max(deft , temp);
        }
        return deft;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna