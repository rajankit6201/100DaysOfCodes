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
    public List<Integer> rec(TreeNode root , ArrayList<Integer> li){
        if(root == null) return li;
        rec(root.left , li);
        rec(root.right , li);
        li.add(root.val);
        return li;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> li =new ArrayList<>();
         return rec(root , li);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna