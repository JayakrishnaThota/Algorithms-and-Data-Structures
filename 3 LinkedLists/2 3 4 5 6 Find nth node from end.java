//One pass O(n) time and O(1) space
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        ListNode prev = null;
        while(fast!=null){
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        if(slow==head) return head.next;
        prev.next = slow.next;
        return head;
    }
}
