class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int sumOdd = n*n;
        int sumEven = n*(n+1);

            
            while(sumEven != 0)
                {
                    int temp =  sumEven;
                    sumEven = sumOdd%sumEven;
                    sumOdd = temp;
                }
            return sumOdd;
            }
        
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna