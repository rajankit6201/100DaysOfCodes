class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change = 0;
        int chage10 = 0;
        for(int i =0 ;i<bills.length;i++){
            if(bills[i] == 5) change++;
            else if(bills[i] == 10){
                if(change <1) return false;
                change--;
                chage10++;
            }
            else{
                if(chage10 > 0 && change > 0){
                    chage10--;
                    change--;
                }
                else if(change > 2){
                    change-=3;
                }else {
                    return false;
                }
            }
        }   
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna