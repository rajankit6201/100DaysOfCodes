/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum =0;
    public boolean hlepher(TreeNode root){
        if(root == null) return true;
        if(root.left == null && root.right == null) sum+=root.val;
        boolean left =   hlepher(root.left);
        boolean right =  hlepher(root.right);
        return left && right;
    }
    public boolean checkTree(TreeNode root) {
        hlepher(root);
        if(root.val == sum) return true;
        return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna