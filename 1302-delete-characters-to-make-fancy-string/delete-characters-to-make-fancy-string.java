class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder("");
        sb.append(s.charAt(0));
        int count = 1;
        for(int i = 1;i<s.length();i++){
            if(sb.charAt(sb.length()-1) == s.charAt(i) && count <2){
                sb.append(s.charAt(i));
                count++;
            }
            else if(sb.charAt(sb.length()-1) != s.charAt(i)){
                sb.append(s.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna