// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     private boolean helper(TreeNode root , int min , int max){
//         if(root == null) return true;
//         if(root.val > min && root.val < max) return true;
//         boolean left = helper(root.left , Integer.MIN_VALUE ,root.val);
//         boolean right = helper(root.right , root.val , Integer.MAX_VALUE);
//         return left && right;
//     }
//     public boolean isValidBST(TreeNode root) {
//         if(root == null) return true;
//         return helper(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
        
//     }
// }

class Solution {
    private boolean helper(TreeNode root, long min, long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return helper(root.left, min, root.val) &&
               helper(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna