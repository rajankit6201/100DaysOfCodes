/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = new TreeNode(0);

    private TreeNode helper(TreeNode root, int p, int q) {
        if (root == null)
            return null;

            ans = root;
        if (p < root.val && q < root.val) {
            helper(root.left, p, q);
        }


        if (p > root.val && q > root.val) {
            helper(root.right, p, q);
        }

        return ans;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p.val, q.val);
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna