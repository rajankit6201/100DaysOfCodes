class Solution {
    public int getNumber(char n ){
        switch(n){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D':  return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public int romanToInt(String s) {
        // int I = 1 , V = 5 , X = 10 , L = 50 , C = 100, D = 500 , M = 1000;
        int n = s.length();
        char last = s.charAt(n - 1);
        int count = getNumber(last);
        for (int i = n - 2; i >= 0; i--) {
            if (getNumber(s.charAt(i)) >= getNumber(s.charAt(i + 1))) {
                count += getNumber(s.charAt(i));
            } else
                count -= getNumber(s.charAt(i));
        }

        return count;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna