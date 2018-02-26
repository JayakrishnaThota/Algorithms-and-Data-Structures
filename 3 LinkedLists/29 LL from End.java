//O(n) time and space
public void display(ListNode head)
{
  if(head==null) return;
  display(head.next);
  System.out.print(head.val+"->);
}
