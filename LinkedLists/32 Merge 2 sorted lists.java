//O(n) time and O(1) space 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
