class Solution {
    ListNode local;
    public boolean isPllin(ListNode head , ListNode temp){
        if(temp == null) return true;
        if(!isPllin(head , temp.next)){
            return false;
        }
        if(local.val != temp.val) return false;
        local = local.next;
        return true;
    }


    public boolean isPalindrome(ListNode head) {
        local = head;
        return(isPllin(head , head));

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna