class Solution {
    public int binarySearch(int[] nums2, int target, int start) {
        int low = start;
        int high = nums2.length - 1;
        int ans = start;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums2[mid] >= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int maxDist = 0;

        for (int i = 0; i < n; i++) {
            if (i >= m || nums1[i] > nums2[i]) {
                continue;
            }
            int j = binarySearch(nums2, nums1[i], i);
            maxDist = Math.max(maxDist, j - i);
        }

        return maxDist;
    }
}