class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String s : words){
            int sum = 0;
            for(int i=0; i<s.length(); i++){
                sum += weights[s.charAt(i) - 'a'];
            }
            int c = 25 - (sum % 26);
            ans.append((char) ('a' + c));
        }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna