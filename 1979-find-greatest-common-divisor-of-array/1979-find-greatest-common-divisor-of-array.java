class Solution {
    public int findGCD(int[] nums) {
        int min=100000;
        int max=-1;
        for(int i : nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int gcd=1;
        for(int i=2;i<=min;i++){
            if(min%i==0 && max%i==0)gcd=i;
        }
        return gcd;
    }
}