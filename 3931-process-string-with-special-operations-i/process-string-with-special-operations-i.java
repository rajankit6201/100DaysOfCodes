class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            switch(c){
                case '*' : 
                if(sb.length() != 0)
                sb.deleteCharAt(sb.length() - 1); 
                break;
                case '#' : 
                sb.append(sb);
                break;
                case '%' : 
                sb.reverse();
                break;
                default : 
                sb.append(c);
            }
        }
        String srt = sb.toString();
        return srt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna