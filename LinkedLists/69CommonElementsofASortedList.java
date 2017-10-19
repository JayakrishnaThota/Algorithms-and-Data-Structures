public class Solution{
	public ListNode printcommon(ListNode l1, ListNode l2){
		ListNode dummy = new ListNode(0);
		ListNode ret = dummy;
		while(l1!=null&&l2!=null){
			if(l1.data==l2.data){
				ListNode newnode = new ListNode(l1.data);
				dummy.next = newnode;
				dummy = dummy.next;
				l1 = l1.next;
				l2 = l2.next;
			}
			else if(l1.data>l2.data){
				l2 = l2.next;
			}
			else 
			l1 = l1.next;
		}
		return ret.next;
	}
}