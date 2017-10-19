//TC:O(n) and SC:O(1)
public class Solution{
	public void FirstEventhenOdd(ListNode head){
		ListNode evenstart, evenend;
		ListNode oddstart, oddend;
		ListNode iter = head;
		while(iter!=null){
			//If the current node is even and even start is null, then assign this node to even start
			if(iter.val%2==0){
				if(evenstart==null){
					evenstart = iter;
					evenend = evenstart;
				}
				else{
					evenend.next = iter;
					evenend = evenend.next; 
				}
			}
			else{
				if(oddstart==null){
					oddstart = iter;
					oddend = oddstart;
				}
				else{
					oddend.next = iter;
					oddend = oddend.next; 
				}
			}
			iter = iter.next;
		}
		if(evenstart==null||oddstart==null) return;
		evenend.next = oddstart;
		oddend.next = null;
		head = evenstart;
	}
}