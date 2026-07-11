class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }  // creating the graph

        for (int[] e : edges) {  // initializing the graph
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] vis = new boolean[n];
        int completeCount = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {

                // collect nodes of this component
                List<Integer> nodesOfAComponent = new ArrayList<>();
                dfs(graph, vis, nodesOfAComponent, i);

                int nodes = nodesOfAComponent.size();
                int componentSize = 0;

                // count total edges inside component
                for (int node : nodesOfAComponent) {
                    componentSize += graph.get(node).size();
                }

                componentSize /= 2;  // since undirected, each edge counted twice

                // check if complete graph: edges = n*(n-1)/2
                if (componentSize == nodes * (nodes - 1) / 2) {
                    completeCount++;
                }
            }
        }
        return completeCount;
    }

    private void dfs(List<List<Integer>> graph, boolean[] vis, 
                     List<Integer> component, int i) {
        vis[i] = true;
        component.add(i);

        for (int k : graph.get(i)) {
            if (!vis[k]) {
                dfs(graph, vis, component, k);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna