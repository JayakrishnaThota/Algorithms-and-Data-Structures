//O(n) time and O(1) space
public class Solution {
    public boolean hasCycle(ListNode head) {
        //Sanity check
        if(head==null || head.next==null) return false;
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
