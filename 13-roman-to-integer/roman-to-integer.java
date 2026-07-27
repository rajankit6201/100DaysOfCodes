class Solution {

    public int getvalue(char ch){
        switch(ch){
            case 'I': return 1;
           
             case 'V': return 5;
            
             case 'X': return 10;
            
             case 'L': return 50;
           
             case 'C': return 100;
           
             case 'D': return 500;
           
             case 'M': return 1000;
           
        }
        return 0;
    }

    public int romanToInt(String s) {

        int n = s.length();
        int value = 0;
        value = value + getvalue(s.charAt(n-1));
        for(int i = n-2;i>=0;i--){
            if(getvalue(s.charAt(i)) < getvalue(s.charAt(i+1)))
            value-=getvalue(s.charAt(i));
            else{
                value+=getvalue(s.charAt(i));
            }
        }
        return value;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna