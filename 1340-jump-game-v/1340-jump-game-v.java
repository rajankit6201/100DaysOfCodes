import java.util.Arrays;

public class Solution {
    private int[] dp;
    private int n;

    public int maxJumps(int[] arr, int d) {
        n = arr.length;
        dp = new int[n];
        Arrays.fill(dp, -1); // -1 signifies that the index hasn't been computed yet
        
        int maxVisited = 0;
        for (int i = 0; i < n; i++) {
            maxVisited = Math.max(maxVisited, dfs(i, arr, d));
        }
        
        return maxVisited;
    }

    private int dfs(int i, int[] arr, int d) {
        // Return cached result if already calculated
        if (dp[i] != -1) {
            return dp[i];
        }

        int maxFromCurrent = 1;

        // 1. Jump to the right (i + x)
        for (int j = i + 1; j <= Math.min(i + d, n - 1); j++) {
            if (arr[i] <= arr[j]) {
                break; // Blocked by a taller or equal bar
            }
            maxFromCurrent = Math.max(maxFromCurrent, 1 + dfs(j, arr, d));
        }

        // 2. Jump to the left (i - x)
        for (int j = i - 1; j >= Math.max(0, i - d); j--) {
            if (arr[i] <= arr[j]) {
                break; // Blocked by a taller or equal bar
            }
            maxFromCurrent = Math.max(maxFromCurrent, 1 + dfs(j, arr, d));
        }

        return dp[i] = maxFromCurrent;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna