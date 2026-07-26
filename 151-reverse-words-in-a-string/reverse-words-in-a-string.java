class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String ans = "";

        String[] word = s.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            if (word[i].length() != 0) {
                ans += word[i];
                ans += " ";
            }
        }
        return ans.trim();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna