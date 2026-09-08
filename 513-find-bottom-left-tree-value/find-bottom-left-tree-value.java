class Solution {
    private int maxDepth;
    private int bottomLeftValue;

    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        bottomLeftValue = 0;
        dfs(root, 0);
        return bottomLeftValue;
    }

    private void dfs(TreeNode current, int depth) {
        if (current == null) {
            return;
        }
        if (depth > maxDepth) {  // If true, we discovered a new level
            maxDepth = depth;
            bottomLeftValue = current.val;
        }
        dfs(current.left, depth + 1);
        dfs(current.right, depth + 1);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna