class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length(), j = 0;
        int[] freq = new int[26];
        char[] chars = s.toCharArray();

        for (int i = 0; i < n >> 1; i++)
            freq[(chars[i] & 31) - 1]++;

        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                chars[j] = (char) (97 + i);
                chars[n - 1 - j++] = (char) (97 + i);
            }
        }

        return new String(chars);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna