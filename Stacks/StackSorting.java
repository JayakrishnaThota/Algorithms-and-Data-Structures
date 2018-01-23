//O(n2) and O(n)
public class Solution{
  public Stack<Integer> sort(Stack<Integer> stk){
    Stack<Integer> rstk = new Stack();
    while(!stk.isEmpty()){
      int tmp = stk.pop();
      while(!rstk.isEmpty()&&rstk.peek()>tmp)
        stk.push(rstk.pop());
      rstk.push(tmp);
      }
    return rstk;
   }
}
      
