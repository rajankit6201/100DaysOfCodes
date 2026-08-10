import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] arr = new int[2];
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int i = 0;i<n;i++){
            int val = nums[i];
            if(map.containsKey(target-nums[i])){
                if(val == target-val && (map.get(nums[i]) >1)){
                    arr[0] =i;
                    for(int j =i+1;j<n;j++){
                        if(nums[j] == target - val){
                            arr[1] = j;
                            return arr;
                        }
                    }
                }
                else{
                    arr[0] =i;
                    for(int j =i+1;j<n;j++){
                        if(nums[j] == target - val){
                            arr[1] = j;
                            return arr;
                        }
                    }                    
                }
            }
        }
        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna