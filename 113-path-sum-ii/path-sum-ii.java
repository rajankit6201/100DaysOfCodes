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
    
    public void helper(TreeNode root , int target , ArrayList<Integer> list , ArrayList<List<Integer>> ans){
        if(root == null) return ;

        list.add(root.val);

        if(root.left == null && root.right == null && target == root.val) {
            ans.add(new ArrayList<>(list));
        }
        // list.add(root.val);
        helper(root.left , target-root.val , list, ans);
        helper(root.right , target- root.val , list, ans);
        list.remove(list.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        helper(root , targetSum , li , ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna