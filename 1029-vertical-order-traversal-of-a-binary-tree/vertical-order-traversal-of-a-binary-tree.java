class Que{
    TreeNode node;
    int row;
    int col;
    public Que(TreeNode _node , int _row , int _col){
        node = _node;
        row = _row;
        col = _col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Que> q = new LinkedList<Que>();
        q.offer(new Que(root , 0 ,0));
        while(!q.isEmpty()){
            Que que = q.poll();
            TreeNode node = que.node;
            int row = que.row;
            int col = que.col;

            if(!map.containsKey(row)){
                map.put(row, new TreeMap<>());
            }
            if(!map.get(row).containsKey(col)){
                map.get(row).put(col , new PriorityQueue<>());
            }
            map.get(row).get(col).offer(node.val);
            if(node.left != null){
                q.offer(new Que(node.left , row-1, col+1));
            }
            if(node.right != null){
                q.offer(new Que(node.right , row+1 , col+1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer , PriorityQueue<Integer>> ys : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : ys.values()){
                while(!nodes.isEmpty()){
                    list.get(list.size()-1).add(nodes.poll());
                }
            }
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna