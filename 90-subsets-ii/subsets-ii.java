class Solution {
    List<List<Integer>> root = new ArrayList<>();
    public void rec(int idx, int n, ArrayList<Integer> li, int[] arr) {
        if (idx >= n) {
            if(!(root.contains(li)))
            root.add(new ArrayList<>(li));
            return;
        }
        li.add(arr[idx]);
        rec(idx + 1, n, li, arr);

        li.remove(li.size() - 1);
        
        rec(idx + 1, n, li, arr);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> li = new ArrayList<>();
        rec(0 , n, li , nums);
        return root;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna