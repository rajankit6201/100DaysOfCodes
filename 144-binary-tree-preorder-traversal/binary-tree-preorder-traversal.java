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
    public void solu(TreeNode root , ArrayList<Integer> li){
        if(root == null) return;
         li.add(root.val);
    solu(root.left, li);
    solu(root.right, li);
    }
   
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();
        solu(root, li);
        return li;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna