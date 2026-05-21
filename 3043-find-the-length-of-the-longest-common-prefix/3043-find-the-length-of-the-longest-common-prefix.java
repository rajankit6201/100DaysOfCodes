import java.util.HashSet;

public class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefixes = new HashSet<>();
        
        for (int val : arr1) {
            while (val > 0) {
                prefixes.add(val);
                val /= 10;
            }
        }
        
        int maxLength = 0;
        
        for (int val : arr2) {
            while (val > 0) {
                if (prefixes.contains(val)) {
                    int currentLength = String.valueOf(val).length();
                    maxLength = Math.max(maxLength, currentLength);
                    break;
                }
                val /= 10;
            }
        }
        
        return maxLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna