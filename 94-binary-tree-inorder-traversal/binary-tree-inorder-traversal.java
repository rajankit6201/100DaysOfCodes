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
    public void recu(TreeNode root , ArrayList<Integer> li){
        if(root == null) {
            return;
        }
    recu(root.left, li);
    li.add(root.val);
    recu(root.right , li);

        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();
        recu(root , li);
        return li;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna