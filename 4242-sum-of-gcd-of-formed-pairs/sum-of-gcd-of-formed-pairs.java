class Solution {
    public void calculateGcd(int val , int max , int[] temp,  int i){
        while(val != 0){
            int t = val;
            val = max%val;
            max = t;
        }
        temp[i] = max;
    }
    public int gcd(int low , int high){
        while(low != 0){
            int temp = low;
            low = high%low;
            high = temp;
        }
        return high;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int max = nums[0];
        for(int i = 0;i<n;i++){
            max = Math.max(max , nums[i]);
            calculateGcd(nums[i] , max , prefix , i);
        }
        Arrays.sort(prefix);

        int low = 0;
        int  high = n-1;
        long sum = 0;
        while(low < high){
          sum+= gcd(prefix[low] , prefix[high]);
            low++;
            high--;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna