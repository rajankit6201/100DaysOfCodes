class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    int n = nums.length;
    int[] result = new int[n];

    int leftCount = 0;
    for (int x : nums)
        if (x < pivot) leftCount++;

    int equalCount = 0;
    for (int x : nums)
        if (x == pivot) equalCount++;

    int left = 0;
    int right = leftCount + equalCount;

    for (int x : nums) {
        if (x < pivot)       result[left++] = x;
        else if (x == pivot) result[leftCount++] = x;
        else                 result[right++] = x;
    }

    return result;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna