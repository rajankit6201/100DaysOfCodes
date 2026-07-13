class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> result = new ArrayList<>();
        
        int minLen = String.valueOf(low).length();
        int maxLen = String.valueOf(high).length();
        
        for (int len = minLen; len <= maxLen; len++) {
            for (int i = 0; i <= 9 - len; i++) {
                int num = Integer.parseInt(s.substring(i, i + len));
                
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna