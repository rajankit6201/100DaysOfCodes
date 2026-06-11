class Solution {
    private long depthUsingDFS(List<Integer>[] adj, int srcNode, int parentNode) {
        long maxDepth = 0;

        for (int nbrNode : adj[srcNode]) {
            if (nbrNode != parentNode) {
                maxDepth = Math.max(
                    maxDepth,
                    depthUsingDFS(adj, nbrNode, srcNode) + 1
                );
            }
        }

        return maxDepth;
    }

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<Integer>[] adj = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];

            adj[u].add(v);
            adj[v].add(u);
        }

        long maxDepth = depthUsingDFS(adj, 1, 0);

        long MOD = 1_000_000_007L, ans = 1, base = 2, exp = maxDepth - 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = (ans * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return (int) ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna