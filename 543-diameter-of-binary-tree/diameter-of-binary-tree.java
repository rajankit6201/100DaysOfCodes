class Solution {
    int max = -1;
    public int diameter(TreeNode root){
        if(root == null) return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        max = Math.max((left+right), max);
        return Math.max(left , right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna