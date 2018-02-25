//O(nlogn) and O(1)
class Solution {
    public ListNode sortList(ListNode head) {
        //Sanity check
        if(head==null || head.next==null) return head;
        ListNode slow = head, fast = head, prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode iter = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                iter.next = l1;
                l1 = l1.next;
                iter = iter.next;
            }
            else{
                iter.next = l2;
                l2 = l2.next;
                iter = iter.next;
            }
        }
        while(l1!=null){
            iter.next = l1;
            l1 = l1.next;
            iter = iter.next;
        }
        while(l2!=null){
            iter.next = l2;
            l2 = l2.next;
            iter = iter.next;
        }
        return dummy.next;
    }
}
