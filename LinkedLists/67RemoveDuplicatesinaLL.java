//TC:O(n) and SC:O(n)
public class Solution{
	public void RemoveDuplicates(ListNode head){
		Set<Integer> set = new HashSet();
		ListNode iter = head; 
		ListNode dummy = new ListNode(0);
		ListNode ret = dummy;
		while(iter!=null){
			if(!set.contains(iter.val)){
				set.add(iter.val);
				dummy.next = iter;
				dummy = dummy.next;
			}
			iter = iter.next;
		}
		return ret.next;
	}
}