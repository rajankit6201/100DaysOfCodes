
class Solution {
    public int dept(TreeNode root , int lavel){
        if(root == null){
            return lavel;
        }
        int left = dept(root.left , lavel+1);
        int right = dept(root.right , lavel+1);
        return Math.max(left, right);
    }
    public int maxDepth(TreeNode root) {
        return dept(root, 0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna