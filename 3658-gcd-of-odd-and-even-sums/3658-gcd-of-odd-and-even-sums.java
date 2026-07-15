class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==2) return n;
        int evensum = 0;
        int oddsum = 0;
        int i = 1;
        while(n != 1)
        {
            if(n%2==0) evensum = evensum+i;
            else
            oddsum= oddsum+i;
            i++;
            n--;
        }
        int gcd = 1;
        int min = Math.min(evensum,oddsum);
        for(int j = min;j>=1;j--)
        {
            if(oddsum%j == 0 && evensum%j == 0)
            {
                gcd = i;
                break;
            }
        }
        return gcd;
        
    }
}