// class Solution {
//     List<List<Integer>> root = new ArrayList<>();

//     public void recur(ArrayList<Integer> list, int idx, int n, int[] arr, int target) {

//         if (target == 0) {
//             root.add(new ArrayList<>(list));
//             return;
//         }

//         if (idx >= n || target < 0) {
//             return;
//         }

//         // Take
//         list.add(arr[idx]);
//         recur(list, idx, n, arr, target - arr[idx]);
//         list.remove(list.size() - 1);

//         // Don't take
//         recur(list, idx + 1, n, arr, target);
//     }

//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int n = candidates.length;
//         recur(list, 0, n, candidates, target);
//         return root;

//     }
// }




class Solution {
    List<List<Integer>> root = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public void backtrack(int[] arr , int idx , int target  , int n){
        if(target == 0 ){
            root.add(new ArrayList<>(list));
            return;
        }
        if(idx >= n ||  target < 0) return;
        list.add(arr[idx]);
        backtrack(arr, idx , target-arr[idx] , n);
        list.remove(list.size() -1);
        backtrack(arr , idx+1, target , n);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        backtrack(candidates , 0 , target , n);
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna