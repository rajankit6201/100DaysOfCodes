class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int wordCount = 0;
        String ans = "";
        char digit = 'z';
        char[] alpha = new char[26];

        // easy to access value 
        for(int i =0;i<26;i++){
            alpha[i] = digit;
            digit--;
        }
        
        int n = words.length;
        for(int i = 0;i<n;i++){
            String temp = words[i];
             for(int j = 0;j<temp.length();j++){
                int idx = (int)(temp.charAt(j) - 'a');
                wordCount+= weights[idx];
            }
            wordCount = wordCount%26;
            ans = ans+ alpha[wordCount];
            wordCount =0;
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna