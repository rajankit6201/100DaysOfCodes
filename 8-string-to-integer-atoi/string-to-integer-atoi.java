// class Solution {
//     public int myAtoi(String s) {
        
//        s =  s.trim();
//        if(s.length() == 0 ) return 0;
//        boolean negative = false;
//        int i = 0;
//        if(s.charAt(0) == '-'){
//             negative = true;
//             i++;
//        }
//        else if(s.charAt(0) == '+'){
//         i++;
//        }
//        long ans = 0;
//        int res = 0;
//        for(;i<s.length();i++){
//         char digit = s.charAt(i);
//         if(digit >= '0' && digit <='9'){
//             int val = (int)digit - '0';
//             ans = ans*10 + val;
//         }
//         else break;

//        }
//        if(negative){
//                 System.out.println(ans);
//         ans*=-1;
//        }

//        if(ans < -2147483648 ){
//         res = -2147483648;
//        }
//        else if(ans > 2147483647){
//         res = 2147483647;
//        }
//        else{
//         res = (int)ans;
//        }
//        return res;

//     }
// }

// // Synced seamlessly with LeetHub Pro
// // Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// // Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna


class Solution {
    public int myAtoi(String s) {
        
        int i=0;
        int sign=1;
        long res=0;
        s=s.trim();
        if(s.isEmpty())return 0;
        if(s.charAt(i)=='-'|| s.charAt(i)=='+'){
        sign=(s.charAt(i)=='-') ? -1 : 1;
        i++;
        }
        
        while(i<s.length() && Character.isDigit(s.charAt(i)) )
        {
            res= res*10 +(s.charAt(i)-'0');
        if (sign * res > Integer.MAX_VALUE ) return Integer.MAX_VALUE;
        if(sign* res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        return (int)res*sign;

    }
}