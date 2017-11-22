class Solution {
    public boolean isValid(String s) {
        if(s==null||s.length()==0) return true;
        Stack<Character> stack = new Stack();
        int i=0;
        int n =s.length();
        while(i<n){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                    stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty() || stack.peek()!='(')
                    return false;
                else stack.pop();
            }
            else if(s.charAt(i)=='}'){
                if(stack.isEmpty() || stack.peek()!='{')
                    return false;
                else stack.pop();
            }
            else if(s.charAt(i)==']'){
                if(stack.isEmpty() || stack.peek()!='[')
                    return false;
                else stack.pop();
            }
            i++;
        }
        return stack.isEmpty();
    }
}
