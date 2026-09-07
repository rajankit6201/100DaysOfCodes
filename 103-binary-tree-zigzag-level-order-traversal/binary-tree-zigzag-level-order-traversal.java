// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
//     }
// }


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        if (root == null) {
            return result;
        }
        int lavel = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLavelList = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode currentNode = queue.poll();
                currentLavelList.add(currentNode.val);
                
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            if(lavel%2 != 0) Collections.reverse(currentLavelList);
            result.add(currentLavelList); 
            lavel++;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna