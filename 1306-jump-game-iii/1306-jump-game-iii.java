class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        
        // Queue for BFS and a boolean array to track visited indices
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        // Initialize BFS with the starting index
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            
            // Base Case: If we find a 0, we reached our goal
            if (arr[curr] == 0) {
                return true;
            }
            
            // Option 1: Jump forward (i + arr[i])
            int forward = curr + arr[curr];
            if (forward < n && !visited[forward]) {
                visited[forward] = true;
                queue.add(forward);
            }
            
            // Option 2: Jump backward (i - arr[i])
            int backward = curr - arr[curr];
            if (backward >= 0 && !visited[backward]) {
                visited[backward] = true;
                queue.add(backward);
            }
        }
        
        // If the queue is empty and we haven't returned true, 0 is unreachable
        return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna