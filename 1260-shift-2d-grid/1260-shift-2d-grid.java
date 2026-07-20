class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int idx =0;

        int[] list = new int[row*col];
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                list[idx] = grid[i][j];
                idx++;
            }
        }
        //traverse on 1D arrays 
        int len = row*col;
        k = k%len;
        ArrayList<List<Integer>> root = new ArrayList<>();
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = len-k;i<len;i++){
            temp.add(list[i]);
            count++;
            if(count % col == 0){
                root.add(temp);
                temp = new ArrayList<>();
            }
            System.out.println(temp);
        }

        for(int i = 0;i<len-k;i++){
            temp.add(list[i]);
            count++;
            if(count % col == 0){
                root.add(temp);
                temp = new ArrayList<>();
            }
        }
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna