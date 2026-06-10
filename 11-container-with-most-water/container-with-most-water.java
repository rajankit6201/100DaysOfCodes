class Solution {
    public int maxArea(int[] height) {
        int jar = 0;
        int bound = Integer.MAX_VALUE;
        int n = height.length;
        int low = 0;
        int high = n-1;
        while(low<high){
           bound = Math.min(height[low] , height[high]);
            jar = Math.max(jar , (high -low) * bound);
            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
            System.out.println(jar);
        }
        return jar;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna