class Solution {
    public void helper(TreeNode root , int val){
        if(root == null) return ;


        if(root.val > val){
            if(root.left == null){
                root.left = new TreeNode(val);
                return;
            }
            helper(root.left, val);
        } 
        
        else{
            if(root.right == null){
                root.right = new TreeNode(val);
                return;
            }
            helper(root.right , val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode temp = root;
        helper(temp , val);
        return root;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna