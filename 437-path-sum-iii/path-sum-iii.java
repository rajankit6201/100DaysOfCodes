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
    int ans = 0;

    public void helper(TreeNode root, long sum, int target) {
        if (root == null)
            return;
        sum += root.val;
        if (sum == target)
            ans++;
        helper(root.left, sum, target);
        helper(root.right, sum, target);

    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode current = st.pop();
            helper(current, 0, targetSum);
            if (current.left != null) {
                st.push(current.left);
            }
            if (current.right != null) {
                st.push(current.right);
            }
        }
        return ans;
    }
}

// class Solution {

//     int ans = 0;

//     // Counts all valid paths starting from the current node.
//     private void dfs(TreeNode root, long sum, int target) {

//         if (root == null)
//             return;

//         sum += root.val;

//         if (sum == target)
//             ans++;

//         dfs(root.left, sum, target);
//         dfs(root.right, sum, target);
//     }

//     public int pathSum(TreeNode root, int targetSum) {

//         if (root == null)
//             return 0;

//         Stack<TreeNode> stack = new Stack<>();
//         stack.push(root);

//         while (!stack.isEmpty()) {

//             TreeNode node = stack.pop();

//             dfs(node, 0, targetSum);

//             if (node.left != null)
//                 stack.push(node.left);

//             if (node.right != null)
//                 stack.push(node.right);
//         }

//         return ans;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna