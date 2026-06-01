class Solution {
    public int minimumCost(int[] cost) {
        int count = 1;
        int price = 0;
        int n = cost.length;
        Arrays.sort(cost);
        for(int i = n-1;i>=0;i--){
            if(count%3 == 0){
                count++;
            }
            else{
                price += cost[i];
                count++;
            }
            
        }
        return price;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna