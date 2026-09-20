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
    ArrayList<Integer> list = new ArrayList<>();
    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        
    }
    private TreeNode buildTree(TreeNode balace , int start , int end){
        if(start > end) return null;
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildTree(balace , start , mid-1);
        root.right = buildTree(balace , mid+1 , end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return buildTree(root , 0 , list.size() -1);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna