//Recursive O(nlogn) Time and O(n) space solution
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return helper(head,null);
    }
    public TreeNode helper(ListNode head, ListNode tail){
        if(head==tail) return null;
        ListNode slow = head, fast = head;
        while(fast!=tail&&fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(head,slow);
        root.right = helper(slow.next,tail);
        return root;
    }
}
