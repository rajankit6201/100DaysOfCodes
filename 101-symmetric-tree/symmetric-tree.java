class Solution {
    public boolean isSymmetric(TreeNode root) {
        return divideTree(root.left, root.right);
    }
    public boolean divideTree(TreeNode l , TreeNode r){
        if(l == null && r == null) return true;
        if(l == null || r == null) return false;
        if(l.val != r.val) return false;
        boolean s= divideTree(l.left , r.right);
        boolean f = divideTree(l.right, r.left);
        return s&&f;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna