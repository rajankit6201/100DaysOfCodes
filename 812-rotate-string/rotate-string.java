class Solution {
    public boolean rotateString(String s, String goal) {
        int src = s.length();
        int des = goal.length();
        if(src != des) return false;
        for(int i = 0;i<src;i++){
            boolean check = true;
            if(goal.charAt(0) == s.charAt(i)){
                int idx = i;
                for(int j =0;j<des;j++, idx++){
                    if(s.charAt(idx%src) != goal.charAt(j%src)){
                        check = false;
                        break;
                    }
                }
                if(check) return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna