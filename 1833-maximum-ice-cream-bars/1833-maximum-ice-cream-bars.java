class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count =0;
        Arrays.sort(costs);
        for(int i = 0;i<costs.length;i++){
            if(costs[i] <= coins){
                count++;
                coins = coins - costs[i];
            } else{
                break;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna