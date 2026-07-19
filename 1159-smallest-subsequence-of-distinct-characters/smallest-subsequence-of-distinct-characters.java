import java.util.*;

class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        boolean[] vis = new boolean[26];
        int n = s.length();

        // Count frequency
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            char chr = s.charAt(i);

            // Current character ka frequency kam karo
            freq[chr - 'a']--;

            // Agar already stack me hai to skip
            if (vis[chr - 'a'])
                continue;

            // Greedy pop
            while (!st.isEmpty() &&
                   st.peek() > chr &&
                   freq[st.peek() - 'a'] > 0) {

                vis[st.pop() - 'a'] = false;
            }

            st.push(chr);
            vis[chr - 'a'] = true;
        }

        // Stack -> String
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna