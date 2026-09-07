class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;
        if(p == null || q  == null) return false;
        if(p.val != q.val)return false;
        boolean l = isSameTree( p.left,  q.left);
        boolean r = isSameTree( p.right,  q.right);
        return l && r;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna