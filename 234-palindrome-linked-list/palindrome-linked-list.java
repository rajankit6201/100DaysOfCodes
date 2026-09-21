/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode local;
    private boolean helper(ListNode head){
        if(head == null) return true;
        boolean result = helper(head.next);
        if(local.val != head.val) return false;
        local = local.next;
        return true && result;
    }
    public boolean isPalindrome(ListNode head) {
        local = head;
        return helper(head);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna