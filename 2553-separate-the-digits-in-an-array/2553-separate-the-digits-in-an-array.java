class Solution {
    public int[] separateDigits(int[] nums) {
         Stack<Integer> st = new Stack<>();
        ArrayList<Integer> li = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int val = nums[i];
            while(val != 0){
                int rem = val%10;
                st.push(rem);
                val = val/10;
            }
            while(!st.isEmpty()){
                li.add(st.pop());
            }
        }
        int[] ans = new int[li.size()];
        int i = 0;
        for(int ele : li){
            ans[i] = ele;
            i++;
        }
        return ans;
    }
}