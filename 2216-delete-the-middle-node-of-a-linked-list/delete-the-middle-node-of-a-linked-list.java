class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode trav = head;
        ListNode ans = head;
        if(head.next == null) return null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        while(trav != null){
            if(trav.next == slow){
                trav.next = trav.next.next;
            }
            trav = trav.next;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna