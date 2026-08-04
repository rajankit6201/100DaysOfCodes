class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> li = new ArrayList<>();
        HashSet<Integer> hash  = new HashSet<>();
        for(int i : nums)
        hash.add(i);
        
        for(int i = nums[0];i<nums[nums.length -1];i++){
            if(!hash.contains(i)){
                li.add(i);
            }
        }
        return li;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna