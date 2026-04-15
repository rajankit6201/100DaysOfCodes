class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int dist = 0;
        int len  = words.length; 
        while (!words[(startIndex + dist) % len].equals(target) 
            && !words[(startIndex - dist + len) % len].equals(target)) {
                dist++;
                if (dist > len) return -1;
            };

        return dist;
    }
}