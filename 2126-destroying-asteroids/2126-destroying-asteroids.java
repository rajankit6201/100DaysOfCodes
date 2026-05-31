class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long finalMask = mass;
        Arrays.sort(asteroids);
        for (int i = 0; i < asteroids.length; i++) {
            if (finalMask < asteroids[i])
                return false;
            finalMask += asteroids[i];
        }
        return true;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna