// class Solution {
//     int startind = 0;
//     HashMap<Integer , Integer> map = new HashMap<>();
//     public TreeNode buildTree(int[] inorder, int[] postorder) {
//         for(int i = 0;i<inorder.length;i++){
//             map.put(inorder[i] ,i);
//         }
//         startind = inorder.length-1;
//         return build(postorder, 0 ,inorder.length-1);
//     }
//     private TreeNode build(int[] postorder , int start , int end){
//         if(start > end) return null;
//         int nodeVal = postorder[startind--];
//         TreeNode root = new TreeNode(nodeVal);
//         int mid = map.get(nodeVal);
//         root.left = build(postorder,start , mid-1);
//         root.right = build(postorder , mid+1 , end);
//         return root;
//     }
// }


class Solution {
    int postIndex;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        postIndex = postorder.length - 1;
        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int start, int end) {
        if (start > end) return null;

        int nodeVal = postorder[postIndex--];
        TreeNode root = new TreeNode(nodeVal);
        int mid = map.get(nodeVal);

        root.right = build(postorder, mid + 1, end);   // pehle right
        root.left  = build(postorder, start, mid - 1); // phir left

        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna