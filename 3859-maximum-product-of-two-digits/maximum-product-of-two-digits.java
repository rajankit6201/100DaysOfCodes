class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        while(n != 0){
            li.add(n%10);
            n =n/10;
        }
        Collections.sort(li);
        int len = li.size();
        return li.get(len-1) * li.get(len-2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna