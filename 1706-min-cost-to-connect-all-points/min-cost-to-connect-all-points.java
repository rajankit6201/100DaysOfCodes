class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int xi = points[i][0];
                int yi = points[i][1];

                int xj = points[j][0];
                int yj = points[j][1];

                int distance = Math.abs(xi - xj) + Math.abs(yi - yj);

                adj.get(i).add(new int[] { distance, j });
                adj.get(j).add(new int[] { distance, i });
            }
        }

        int minCost = 0;
        boolean[] inMST = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        pq.offer(new int[] { 0, 0 });

        while (!pq.isEmpty()) {
            int[] top = pq.poll();

            int distance = top[0];
            int point = top[1];

            if (inMST[point])
                continue;

            inMST[point] = true;
            minCost += distance;

            for (int[] neighbour : adj.get(point)) {
                int neiDistance = neighbour[0];
                int neiPoint = neighbour[1];
                if (!inMST[neiPoint])
                    pq.offer(new int[] { neiDistance, neiPoint });
            }
        }

        return minCost;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna