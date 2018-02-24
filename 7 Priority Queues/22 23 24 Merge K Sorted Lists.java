//O(nlogk) time and O(k) space
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //Sanity check
        if(lists==null || lists.length==0) return null;
         PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
           public int compare(ListNode l1, ListNode l2) {
               return l1.val-l2.val;
           }
       });
        for(ListNode l: lists){
            if(l!=null)
            { 
                pq.offer(l);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode iter = dummy;
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            iter.next = temp;
            iter = iter.next;
            if(temp.next!=null) pq.offer(temp.next);
        }
        return dummy.next;
    }
}
