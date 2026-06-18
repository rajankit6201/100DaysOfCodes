class Solution {
  public double angleClock(int hour, int minutes) {
    final double hourHand = (hour % 12 + minutes / 60.0) * 30;
    final double minuteHand = minutes * 6;
    final double diff = Math.abs(hourHand - minuteHand);
    return Math.min(diff, 360 - diff);
  }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna