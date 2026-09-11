class Solution {
    int maximum = -1001;
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        if(left<0) left = 0;
        int right = helper(root.right);
        if(right<0) right =0;
        maximum = Math.max(maximum , (left+right+root.val));
        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maximum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna