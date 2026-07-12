class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int rank = 1;
        int n = arr.length;
        int[] ans = new int[n];
        int idx = 0;
        for(int ele : arr){
            ans[idx] = ele;
            idx++;
        }
        Arrays.sort(arr);
        HashMap<Integer , Integer> map =new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i] , rank++);
            }
        }
        int i = 0;
        for(int ele : ans){
            ans[i] = map.get(ele);
            i++;
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna