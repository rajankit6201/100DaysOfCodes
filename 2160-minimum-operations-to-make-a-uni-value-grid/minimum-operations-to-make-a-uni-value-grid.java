class Solution {
    public int minOperations(int[][] grid, int x) {
        int row = grid.length;
        int col = grid[0].length;
        int ind = 0;
        int[] flat = new int[col*row];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                flat[ind] = grid[i][j];
                ind++;
            }
        }
        Arrays.sort(flat);
        int count = 0;

        int mid= flat[row*col/2];
        for(int i = 0;i<row*col;i++){
            int abs = Math.abs(mid - flat[i]);
            if(abs%x != 0) return -1;
            else{
                count = count + abs/x;

            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna