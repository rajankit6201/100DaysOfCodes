class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int b = map.get('b');
        int a = map.get('a');
        int l = map.get('l') / 2;
        int o = map.get('o') / 2;
        int n = map.get('n');
        int min = Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna