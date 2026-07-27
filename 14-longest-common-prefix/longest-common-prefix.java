class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int n = strs.length;
        int lowIdx = 201;
        for(int i = 0;i<n;i++){
            lowIdx = Math.min(lowIdx , strs[i].length());
        }
        String base = strs[0];
        for(int i = 0;i<lowIdx;i++){
            for(int j = 0;j<n;j++){
                if(strs[j].charAt(i) != base.charAt(i)){
                    return res;
                }
            }
            res+=base.charAt(i);
        }
        return res;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna