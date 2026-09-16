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
    int maxDiff = 0;
    public void helper(TreeNode root , int min ,int max){
        if(root == null) return ;
        min = Math.min(min , root.val);
        max = Math.max(max,root.val);
        maxDiff =Math.max(maxDiff,Math.abs(min - max));
        // System.out.print(maxdiff)
        helper(root.left ,min , max);
        helper(root.right ,min , max);
    }
    public int maxAncestorDiff(TreeNode root) {
        helper(root , root.val , root.val);
        return maxDiff;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna