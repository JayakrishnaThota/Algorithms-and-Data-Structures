//O(n) and O(1) 
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;
        ListNode fast = head, slow = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null) slow = slow.next;
        
        slow = reverse(slow);
        fast = head;
        while(slow!=null)
        {
            if(slow.val!=fast.val) return false;
            slow=slow.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
