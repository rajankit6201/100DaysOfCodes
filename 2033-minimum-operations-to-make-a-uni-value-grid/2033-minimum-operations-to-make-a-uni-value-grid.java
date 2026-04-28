import java.util.Arrays;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int[] flattened = new int[n * m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                flattened[k++] = grid[i][j];
            }
        }

        Arrays.sort(flattened);

        int median = flattened[flattened.length / 2];
        int count = 0;

        for (int num : flattened) {
            int diff = Math.abs(num - median);
            
          
            if (diff % x != 0) {
                return -1;
            }
            count += diff / x;
        }

        return count;
    }
}