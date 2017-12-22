//O(n) time and O(1) space
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = null,lesse=null, great = null,greate=null;
        ListNode iter = head;
        while(iter!=null){
            if(iter.val<x){
                if(less==null){
                    less = iter;
                    lesse = less;
                }
                else{
                    lesse.next = iter;
                    lesse = lesse.next;
                }
            }
            else{
                if(great==null){
                    great = iter;
                    greate = great;
                }
                else{
                    greate.next = iter;
                    greate = greate.next;
                }
            }
            iter = iter.next;
        }
        if(less==null || great==null) return head;
        lesse.next = great;
        if(greate!=null) greate.next = null;
        return less;
    }
}
